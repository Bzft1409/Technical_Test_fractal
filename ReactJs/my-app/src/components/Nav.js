import * as React from 'react';
import Box from '@mui/material/Box';
import Toolbar from '@mui/material/Toolbar';
import Typography from '@mui/material/Typography';
import Button from '@mui/material/Button';
import IconButton from '@mui/material/IconButton';
import ShowOrders from './ShowOrders';
import {
    BrowserRouter as Router,
    Route,
    Routes,
    Link,
    Navigate,
  } from "react-router-dom";
export default function Nav() {
  return (
    <Router>
    <Box sx={{ flexGrow: 1 }}>
        <Toolbar>
          <IconButton
            size="large"
            edge="start"
            color="inherit"
            aria-label="menu"
            sx={{ mr: 2 }}
          >
          </IconButton>
          <Button color="info">
          <Link to="/my-orders">List Orders</Link>
          </Button>
        </Toolbar>
    </Box>
    <Routes>
        <Route path='my-orders' element={<ShowOrders/>}/>
    </Routes>
    </Router>
  );
}
