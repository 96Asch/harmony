import React from 'react';
import logo from './logo.svg';
import './App.css';
import Dashboard from './components/Dashboard'
import { ThemeProvider, createTheme } from '@mui/material/styles';
import { red } from '@mui/material/colors';

function App() {

  const theme = createTheme({
    palette: {
      mode: 'light',
    },
  });

  return (
    <ThemeProvider theme={theme}>
      <Dashboard/>
    </ThemeProvider>
  );
}

export default App;
