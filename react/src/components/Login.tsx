import axios from 'axios'
import React from 'react'
import { useRef, useState } from 'react'
import TextField from '@mui/material/TextField'
import Box from '@mui/material/Box'
import Button from '@mui/material/Button'
import Link from '@mui/material/Link'
import Dialog from '@mui/material/Dialog';
import DialogActions from '@mui/material/DialogActions';
import DialogContent from '@mui/material/DialogContent';
import DialogContentText from '@mui/material/DialogContentText';
import DialogTitle from '@mui/material/DialogTitle';
import PersonAddAltIcon from '@mui/icons-material/PersonAddAlt';

import { DAO, UserRegister, UserLogin } from '../models/Dao'
import ListItemButton from '@mui/material/ListItemButton'
import ListItemText from '@mui/material/ListItemText'
import ListItemIcon from '@mui/material/ListItemIcon'
import Snackbar from '@mui/material/Snackbar'
import { Alert } from '@mui/material'
import { useHarmony } from '../models/Provider'
import { TabProp } from './Dashboard'

export default function Login({ tab, setTab }: TabProp) {
    type Severity = "error" | "success"

    const [modalOpen, setModalOpen] = useState(false);
    const [isLogin, setIsLogin] = useState(true);
    const username = useRef<HTMLInputElement>(null);
    const password = useRef<HTMLInputElement>(null);
    const email = useRef<HTMLInputElement>(null);
    const [snackMessages, setSnackMessages] = useState<Array<string>>([]);
    const [severity, setSeverity] = useState<Severity>('error');
    const emailRegex = /^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@[a-zA-Z0-9-]+(?:\.[a-zA-Z0-9-]+)*$/;

    const { state, dispatch } = useHarmony();

    const OnOpen = () => {
        setModalOpen(true);
    };

    const OnClose = () => {
        setIsLogin(true);
        setSnackMessages([]);
        setModalOpen(false);
    };

    const OnToggle = () => {
        setSnackMessages([]);
        setIsLogin(!isLogin);
    }

    const OnEnterPressed = (event: React.KeyboardEvent<HTMLDivElement>) => {
        console.log(event.key)
        if (event.key === 'Enter') {
            if (isLogin) {
                OnLogin();
            }
            else {
                OnRegister();
            }
        }
    }

    const login = async (dao: DAO) => {
        if (state.api == null) return;
        try {
            const response = await state.api.post('login', dao);
            if (response.data.errors.length !== 0) {
                setSnackMessages(response.data.errors);
                setSeverity("error");
                return;
            }
            localStorage.setItem("user", JSON.stringify({ username: response.data.message.username }));
            localStorage.setItem("token", JSON.stringify({ token: response.data.message.token }));

            console.log("show");
            setSeverity("success");
            setSnackMessages(["Succesfully logged in!"])

            const timeout = setTimeout(() => {
                dispatch({ type: "updateUser", username: response.data.message.username, token: response.data.message.token });
                setTab("notifications");
            }, 3000);
            return () => clearTimeout(timeout);
        }
        catch (error) {
            console.warn(error)
        }
    }

    const OnLogin = () => {
        if (username.current === null || password.current === null) return;

        var errors: Array<string> = [];

        if (password.current.value.length < 8) { errors.push('Password must contain at least 8 characters') }

        if (errors.length > 0) {
            setSeverity("error");
            setSnackMessages([errors.join('\n')]);
            return;
        }

        const userLogin: UserLogin = { username: username.current.value, password: password.current.value }
        const dao: DAO = { method: "POST", message: userLogin };
        login(dao);
    }

    const OnRegister = () => {
        if (username.current === null || password.current === null || email.current === null) { return };

        var errors: Array<string> = [];

        if (password.current.value.length < 8) { errors.push('Password must contain at least 8 characters') }
        if (!email.current.value.match(emailRegex)) { errors.push('E-mail must be a valid e-mail address'); }

        if (errors.length > 0) {
            setSeverity("error");
            setSnackMessages([errors.join('\\n')]);
            return;
        }

        const userRegister: UserRegister = {
            username: username.current.value,
            email: email.current.value,
            password: password.current.value
        }
        const dao: DAO = { method: "POST", message: userRegister };
        register(dao);
    }

    const register = async (dao: DAO) => {
        if (state.api == null) return;
        try {
            const response = await state.api.post('register', dao);
            if (response.data.errors.length !== 0) {
                setSnackMessages(response.data.errors);
                setSeverity("error");
                return;
            }

            setSeverity("success");
            setSnackMessages(["Succesfully signed up!"])
            const timeout = setTimeout(() => {
                OnClose();
            }, 3000);

            return () => clearTimeout(timeout);
        }
        catch (error) {
            console.warn(error)
        }
    }

    const Login = (
        <>
            <DialogTitle>Login</DialogTitle>
            <DialogContent>
                <Box component="form" sx={{ '& .MuiTextField-root': { m: 1, width: '25ch' }, }}>
                    <div>
                        <TextField required autoFocus variant='filled' inputRef={username} label='Username' autoComplete='on' onKeyDown={OnEnterPressed}/>
                    </div>
                    <div>
                        <TextField required variant='filled' inputRef={password} label='Password' type='password' autoComplete='on' onKeyDown={OnEnterPressed}/>
                    </div>
                </Box>
                <DialogContentText>Not yet a user? Sign up <Link href="#" component="button" onClick={OnToggle}>here</Link></DialogContentText>
            </DialogContent>

            <DialogActions>
                <Button onClick={OnClose}>Cancel</Button>
                <Button onClick={OnLogin}>Confirm</Button>
            </DialogActions>
        </>
    )

    const Register = (
        <>
            <DialogTitle>Register</DialogTitle>
            <DialogContent>
                <Box component="form" sx={{ '& .MuiTextField-root': { m: 1, width: '25ch' }, }}>
                    <div>
                        <TextField required autoFocus variant='filled' inputRef={username} label='Username' autoComplete='on' onKeyDown={OnEnterPressed}/>
                    </div>
                    <div>
                        <TextField required autoFocus variant='filled' inputRef={email} label='E-mail' autoComplete='on' onKeyDown={OnEnterPressed}/>
                    </div>
                    <div>
                        <TextField required variant='filled' inputRef={password} label='Password' type='password' autoComplete='on' onKeyDown={OnEnterPressed}/>
                    </div>
                </Box>
                <DialogContentText>Already a user? Sign in <Link href="#" component="button" onClick={OnToggle}>here</Link></DialogContentText>
            </DialogContent>

            <DialogActions>
                <Button onClick={OnClose}>Cancel</Button>
                <Button onClick={OnRegister}>Register</Button>
            </DialogActions>
        </>
    )

    const getModal = (): JSX.Element => {
        if (isLogin)
            return Login;
        else
            return Register;
    }


    return (
        <Box>
            <ListItemButton onClick={OnOpen}>
                <ListItemIcon>
                    <PersonAddAltIcon />
                </ListItemIcon>
                <ListItemText primary="Login/Register" />
            </ListItemButton>
            <Dialog open={modalOpen} onClose={OnClose} keepMounted={true}>
                {getModal()}
                <Snackbar
                    anchorOrigin={{ vertical: 'bottom', horizontal: 'center' }}
                    open={snackMessages.length > 0}
                    key={snackMessages.join()}
                    sx={{ whiteSpace: 'pre-wrap' }}
                >
                    <Alert severity={severity}>{snackMessages.join('\n')}</Alert>
                </Snackbar>
            </Dialog>

        </Box>
    );
}
