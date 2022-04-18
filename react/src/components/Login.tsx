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

import { DAO, UserRegister } from '../gateway/Dao'

export default function Login() {
    const [open, setOpen] = useState(false);
    const [isLogin, setIsLogin] = useState(true);
    const username = useRef<HTMLInputElement>(null);
    const password = useRef<HTMLInputElement>(null);

    const OnOpen = () => {
        setOpen(true);
    };
  
    const OnClose = () => {
        setOpen(false);
    };

    const OnToggle = () => {
        setIsLogin(!isLogin);
    }

    const OnConfirm = async() => {
        if (username.current && password.current) {
            console.log(`username :  ${username.current.value}, password : ${password.current.value}`);
        }
    }

    const api = axios.create({ baseURL : '/api'})

    const OnLogin = async(dao : DAO) => {
        try {
            const response = await api.post('login', dao)
            console.log(response)
        }
        catch (error) {
            console.warn(error)
        }
    }

    const Login = (   
        <>
        <DialogTitle>Login</DialogTitle>
        <DialogContent>
            <Box component="form" sx= {{ '& .MuiTextField-root' : { m: 1, width: '25ch' },}}>
                <div>
                    <TextField autoFocus variant='filled' inputRef={username} label='Username'/>
                </div>
                <div>
                    <TextField variant='filled' inputRef={password} label='Password'/>
                </div>
            </Box>
            <DialogContentText>Not yet a user? Sign up <Link href="#" component="button" onClick={OnToggle}>here</Link></DialogContentText>
        </DialogContent>

        <DialogActions>
            <Button onClick={OnClose}>Cancel</Button>
            <Button onClick={OnConfirm}>Confirm</Button>
        </DialogActions>
        </>
    )

    const Register = (
        <>
        <DialogTitle>Register</DialogTitle>
        <DialogContent>
            <Box component="form" sx= {{ '& .MuiTextField-root' : { m: 1, width: '25ch' },}}>
                <div>
                    <TextField autoFocus variant='filled' inputRef={username} label='Username' />
                </div>
                <div>
                    <TextField autoFocus variant='filled' inputRef={username} label='E-mail' />
                </div>
                <div>
                    <TextField variant='filled' inputRef={password} label='Password'/>
                </div>
            </Box>
            <DialogContentText>Already a user? Sign in <Link href="#" component="button" onClick={OnToggle}>here</Link></DialogContentText>
        </DialogContent>

        <DialogActions>
            <Button onClick={OnClose}>Cancel</Button>
            <Button onClick={OnConfirm}>Register</Button>
        </DialogActions>
        </>
    )

    const getModal = () : JSX.Element =>  {
        if (isLogin) 
            return Login; 
        else  
            return Register; 
    }

    return (
        <Box>
            <Button onClick={OnOpen}> Login/Register </Button>
            <Dialog open={open} onClose={OnClose}>
            {getModal()}
            </Dialog>
        </Box>
     
    );
}
