import React from 'react'
import Drawer from './Drawer'
import Box from '@mui/material/Box';
import { CssBaseline, Toolbar } from '@mui/material';
import Splash from './Splash';
import { Container } from '@mui/material'

export default function Dashboard() {


  return (
  
      <Box sx={{display : 'flex' }}>
        <CssBaseline/>
        <Drawer/>
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
            <Splash/>

          </Container>
        </Box>
      </Box>
  )
}
