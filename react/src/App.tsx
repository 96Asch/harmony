import React, { useEffect } from 'react';
import './App.css';
import Dashboard from './components/Dashboard'
import { ThemeProvider, createTheme } from '@mui/material/styles';
import { HarmonyProvider } from './models/Provider';

function App() {

   
    
    const theme = createTheme({
        palette: {
            mode: 'dark',
        },
    });



    return (
        <ThemeProvider theme={theme}>
            <HarmonyProvider>
                <Dashboard />
            </HarmonyProvider>
        </ThemeProvider>
    );
}

export default App;
