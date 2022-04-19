
import Box from '@mui/material/Box'
import Toolbar from '@mui/material/Toolbar'
import Typography from '@mui/material/Typography'
import React from 'react'

export default function Splash() {
    return (
        <Box sx={{ display: 'flex', justifyContent: 'center', flexDirection: 'column' }}>
            <Typography variant='h3' textAlign='center'>Harmony</Typography>
            <Toolbar/>
            <Typography variant='h6'>
                Organize your arrangements, pieces and songs in one place.
                Share your music with friends, band members and musicians all over the world.
                Optimize your rehearsals and private practice with all the sheets and tracks to help you grow your musical skills.
            </Typography>
        </Box>
    )
}
