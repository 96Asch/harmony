import React from 'react'
import { useState } from 'react';
import MuiDrawer from '@mui/material/Drawer';
import MuiAppBar, { AppBarProps as MuiAppBarProps } from '@mui/material/AppBar';
import Toolbar from '@mui/material/Toolbar';
import Login from './Login'
import List from '@mui/material/List';
import Typography from '@mui/material/Typography';
import Divider from '@mui/material/Divider';
import IconButton from '@mui/material/IconButton';
import MenuIcon from '@mui/icons-material/Menu';
import ChevronLeftIcon from '@mui/icons-material/ChevronLeft';
import { styled } from '@mui/material/styles';
import ListItemButton from '@mui/material/ListItemButton';
import ListItemIcon from '@mui/material/ListItemIcon';
import ListItemText from '@mui/material/ListItemText';
import DashboardIcon from '@mui/icons-material/Dashboard';
import { TabTypeMap, Tooltip } from '@mui/material';
import { useMediaQuery } from "@mui/material";
import { useHarmony } from '../models/Provider';
import UserAvatar from './UserAvatar';
import { Tab, TabProp } from './Dashboard';
import QueueMusicIcon from '@mui/icons-material/QueueMusic';
import AudioFileIcon from '@mui/icons-material/AudioFile';

interface AppBarProps extends MuiAppBarProps {
    open?: boolean;
}

const drawerWidth: number = 240;

const AppBar = styled(MuiAppBar, {
    shouldForwardProp: (prop) => prop !== 'open',
})<AppBarProps>(({ theme, open }) => ({
    zIndex: theme.zIndex.drawer + 1,
    transition: theme.transitions.create(['width', 'margin'], {
        easing: theme.transitions.easing.sharp,
        duration: theme.transitions.duration.leavingScreen,
    }),
    ...(open && {
        marginLeft: drawerWidth,
        width: `calc(100% - ${drawerWidth}px)`,
        transition: theme.transitions.create(['width', 'margin'], {
            easing: theme.transitions.easing.sharp,
            duration: theme.transitions.duration.enteringScreen,
        }),
    }),
    [theme.breakpoints.down('md')]: {
        marginLeft: '0px',
        width: `100%`,
    },
}));

const MaterialDrawer = styled(MuiDrawer, { shouldForwardProp: (prop) => prop !== 'open' })(
    ({ theme, open }) => ({
        '& .MuiDrawer-paper': {
            position: 'relative',
            whiteSpace: 'nowrap',
            width: drawerWidth,
            transition: theme.transitions.create('width', {
                easing: theme.transitions.easing.sharp,
                duration: theme.transitions.duration.enteringScreen,
            }),
            [theme.breakpoints.down('md')]: {
                width: theme.spacing(9),

            },
            boxSizing: 'border-box',
            ...(!open && {
                overflowX: 'hidden',
                transition: theme.transitions.create('width', {
                    easing: theme.transitions.easing.sharp,
                    duration: theme.transitions.duration.leavingScreen,
                }),
                width: theme.spacing(0),
            }),
        },
    }),
);



export default function Drawer({ tab, setTab }: TabProp) {
    interface DrawerItem {
        title: string,
        tab: Tab,
        icon : JSX.Element
    }

    const [open, setOpen] = useState(true);

    const { state } = useHarmony();

    const drawerItems: Array<DrawerItem> = [
        { title: 'Notifications', tab: 'notifications', icon : <DashboardIcon/>},
        { title: 'Songs', tab: 'songs', icon: <AudioFileIcon/> },
        { title: 'Setlists', tab: 'setlists', icon : <QueueMusicIcon/> },
    ]


    const toggleDrawer = () => {
        setOpen(!open);
    };

    const getBottomButton = () => {
        if (state.isLoggedIn) {
            return <UserAvatar tab={tab} setTab={setTab} />;
        }
        return <Login tab={tab} setTab={setTab} />;
    }

    const OnListClick = (item: Tab) => {
        setTab(item);
    }

    const mainListItems = (
        <>
            {drawerItems.map((item) =>  (
                <Tooltip title={item.title} placement='right-start' key={item.title}>
                    <ListItemButton selected={tab === item.tab} onClick={() => { OnListClick(item.tab) }}>
                        <ListItemIcon>
                            {item.icon}
                        </ListItemIcon>
                        <ListItemText primary={item.title} />
                    </ListItemButton>
                </Tooltip>
            ))}
        </>
    );

    return (
        <>
            <AppBar position="absolute" open={open}>
                <Toolbar
                    sx={{
                        pr: '24px',
                    }}
                >
                    <IconButton
                        edge="start"
                        color="inherit"
                        aria-label="open drawer"
                        onClick={toggleDrawer}
                        sx={{
                            marginRight: '24px',
                            ...(open && { display: 'none' }),
                            display: {
                                xs: 'none',
                                md: 'block',
                            }

                        }}
                    >
                        <MenuIcon />
                    </IconButton>
                    <Typography
                        component="h1"
                        variant="h6"
                        color="inherit"
                        noWrap
                        sx={{ flexGrow: 1 }}
                    >
                        Dashboard
                    </Typography>
                </Toolbar>
            </AppBar>
            <MaterialDrawer
                variant="permanent"
                open={open}
                sx={{
                    display: 'flex',
                    flexDirection: 'column',
                }}
            >
                <Toolbar
                    sx={{
                        display: 'flex',
                        alignItems: 'center',
                        justifyContent: 'flex-end',
                        px: [1],
                    }}
                >
                    <IconButton onClick={toggleDrawer}>
                        <ChevronLeftIcon />
                    </IconButton>
                </Toolbar>
                <List>
                    {state.isLoggedIn && mainListItems}
                </List>
                <List style={{ marginTop: `auto` }}>
                    <Divider />
                    {getBottomButton()}
                </List>
            </MaterialDrawer>
        </>

    )
}
