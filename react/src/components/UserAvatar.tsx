import Avatar from '@mui/material/Avatar'
import Box from '@mui/material/Box'
import Button from '@mui/material/Button'
import Dialog from '@mui/material/Dialog'
import DialogActions from '@mui/material/DialogActions'
import DialogContent from '@mui/material/DialogContent'
import DialogContentText from '@mui/material/DialogContentText'
import DialogTitle from '@mui/material/DialogTitle'
import ListItemAvatar from '@mui/material/ListItemAvatar'
import ListItemButton from '@mui/material/ListItemButton'
import ListItemIcon from '@mui/material/ListItemIcon'
import ListItemText from '@mui/material/ListItemText'
import React, { useState } from 'react'
import { useHarmony } from '../models/Provider'
import { TabProp } from './Dashboard'

export default function UserAvatar({tab, setTab} : TabProp) {
    const [modalOpen, setModalOpen] = useState(false);

    const { state, dispatch } = useHarmony();

    const OnOpen = () => {
        console.log(state);
        setModalOpen(true);
    };

    const OnClose = () => {
        setModalOpen(false);
    };

    const OnLogout = () => {
        setTab("splash");
        dispatch({type: "removeUser"});
        OnClose();
    }

    return (
        <Box>
            <ListItemButton onClick={OnOpen}>
                <ListItemAvatar>
                    <Avatar>
                    </Avatar>
                </ListItemAvatar>
                <ListItemText primary={state.username} />
            </ListItemButton>
            <Dialog open={modalOpen} onClose={OnClose}>
                <DialogTitle>Log Out</DialogTitle>
                <DialogContent>
                    <DialogContentText>
                        Are you sure you want to log out {state.username}?
                    </DialogContentText>
                </DialogContent>

                <DialogActions>
                    <Button onClick={OnClose}>Cancel</Button>
                    <Button variant="contained" color="error" onClick={OnLogout}>Confirm</Button>
                </DialogActions>
            </Dialog>
        </Box>
    )
}
