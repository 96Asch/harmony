import React, { useEffect, useState } from 'react'
import Drawer from './Drawer'
import Box from '@mui/material/Box';
import { CssBaseline, Toolbar } from '@mui/material';
import Splash from './Splash';
import { Container } from '@mui/material'
import { useHarmony } from '../models/Provider';
import Notifications from './Notifications';
import Setlists from './Setlists';
import Songs from './Songs';

export type Tab = "splash" | "notifications" | "songs" | "setlists"
export interface TabProp { tab: Tab, setTab: React.Dispatch<React.SetStateAction<Tab>> }

export default function Dashboard() {

    const [tab, setTab] = useState<Tab>("splash");
    const { dispatch } = useHarmony();

    useEffect(() => {
        dispatch({type: "setAPI", baseUrl: "/api"});
        const storedUsername = localStorage.getItem("user");
        const storedToken = localStorage.getItem("token");
        if (storedUsername != null && storedToken != null) {
            try {
                // console.log(JSON.parse(storedUsername))    
                dispatch({ type: "updateUser", username: JSON.parse(storedUsername).username, token: JSON.parse(storedToken).token });
            }
            catch (error) {
                console.warn(error);
            }
        }
    }, [dispatch]);

    const getPage = (): JSX.Element => {
        switch (tab) {
            case "splash":
                return <Splash />;
            case "notifications":
                return <Notifications />;
            case "songs":
                return <Songs />;
            case "setlists":
                return <Setlists />;
        }
    }

    return (

        <Box sx={{ display: 'flex' }}>
            <CssBaseline />
            <Drawer tab={tab} setTab={setTab} />
            <Box
                component="main"
                sx={{
                    backgroundColor: (theme) =>
                        theme.palette.mode === 'light'
                            ? theme.palette.grey[100]
                            : theme.palette.grey[900],
                    flexGrow: 1,
                    height: '100vh',
                    overflow: 'auto',
                }}
            >
                <Toolbar />
                <Container maxWidth="lg" sx={{ mt: 4, mb: 4 }}>
                    {getPage()}
                </Container>
            </Box>
        </Box>
    )
}
