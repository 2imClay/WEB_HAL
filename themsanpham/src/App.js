
import { Route, Routes } from 'react-router-dom';
import './App.css';
import Header from "./page/header/Header"
import Dashboard from './page/dashboard/Dashboard';
import PostProduct from './product/PostProduct';

function App() {
  return (
   <>
   <Header />
   <Routes>
    <Route path='/' element={<Dashboard/>}/>
    <Route path='/product' element={<PostProduct/>}/>
   
   </Routes>
   </>
  );
}

export default App;
