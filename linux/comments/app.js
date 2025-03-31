



//import Greeting from './components/Greeting';
//import Sample from './components/sample';
//import Changethestate from './components/Changethestate';
//import Dept from './components/twocom';
//import Counter from './components/Counter';
//import Togglemessage from './components/Togglemessageclass3';
//import TwoWay from './components/TwoWay';
//import ParentCom from './components/ParentCom';
//import Muidemo from './components/Muidemo';
//import SignIn from './components/Newtry';
//import Newhome from './components/Newhome';
//import BasicPopover from './components/Muipop';

//import Loginpge from './components/Loginpge';
//import Input from './components/Input';
//import Arrayofobject from './components/Arrayofobject';
//import Button from './components/Spread';
//import Hello from './components/Hello';
//import Counterfun from './components/Counterfun';
//import Multiplestate from './components/Multiplestate';
//import Propsstate from './components/Propsstate';
//import Object from './components/Object';
//import Array from './components/Array';

//import Hof from './components/Hof';
//import Input from './components/Input';
//import Demogetaxios from "./components/Demogetaxios";
//import Arrayofobject from "./components/Arrayofobject";
//import ProductCard from './components/Carddemo';

//import Getdemo from "./components/Getdemo";
    
/*import React, { useState } from 'react';
import { BrowserRouter as Router, Route, Routes, Navigate } from 'react-router-dom';
import Signup from './components/Signup';
import Homepage from './components/Homepage';
import Loginpge from './components/Loginpge';
import ProductCard from './components/ProductCard';
import Productview from './components/Productview';
import Addtocart from './components/Addtocart';
import { CartProvider } from './components/CartContext';
import PaymentPage from './components/PaymentPage';
import MyAccount from './components/MyAccount';
import EditProfile from './components/EditProfile';
import Delivery from './components/Delivery';
import MyOrder from './components/MyOrder';
import GiftCard from './components/GiftCard';
import MyPayment from './components/MyPayment';
import Notification from './components/Notification';
import Fruits from './components/Fruits';
import Cleaning from './components/Cleaning';
import Sprouts from './components/Sprouts';
import Vegetables from './components/Vegetables';
import AdminLogin from './components/AdminLogin';
import Admindashboard from './components/Admindashboard';
import Newuser from './components/Newuser';
import AboutUs from './components/AboutUs';
import ContactUs from './components/ContactUs';
import TermsAndConditions from './components/TermsAndConditions';
import PrivacyPolicy from './components/PrivacyPolicy';
import { AuthProvider } from './components/AuthContext';
const App = () => {
  const [currentPage, setCurrentPage] = useState('home');

  const navigateTo = (page) => {
    setCurrentPage(page);
  };

  const renderPage = () => {
    switch (currentPage) {
      case 'home':
        return <Homepage onNavigate={navigateTo} />;
      case 'login':
        return <Loginpge />;
      case 'signup':
        return <Signup />;
      default:
        return <Homepage onNavigate={navigateTo} />;
    }
  };

  return (
    <AuthProvider>
    <CartProvider>
      <Router>
        <Routes>
          <Route path="/" element={renderPage()} />
          <Route path="/myaccount" element={<MyAccount />} />
          <Route path="/productcard" element={<ProductCard />} />
          <Route path="/productview" element={<Productview />} />
          <Route path="/signup" element={<Signup />} />
          <Route path="/login" element={<Loginpge />} />
          <Route path="/privacy-policy" element={<PrivacyPolicy />} />
          <Route path="/fruits" element={<Fruits />} />
          <Route path="/vegetables" element={<Vegetables />} />
          <Route path="/cart" element={<Addtocart />} />
          <Route path="/cleaning" element={<Cleaning />} />
          <Route path="/delivery" element={<Delivery />} />
          <Route path="/my-orders" element={<MyOrder />} />
          <Route path="/edit-profile" element={<EditProfile />} />
          <Route path="/payment" element={<PaymentPage />} />
          <Route path="/gift-card" element={<GiftCard />} />
          <Route path="/my-payments" element={<MyPayment />} />
          <Route path="/aboutus" element={<AboutUs />} />
<Route path="/contactus"element={<ContactUs/>}/>
<Route path="/terms" element={<TermsAndConditions />} />
          <Route path="/admindashboard" element={<Admindashboard />} />
          <Route path="/notifications" element={<Notification />} />
          <Route path="/adminlogin" element={<AdminLogin />} />
          <Route path="*" element={<Navigate to="/" />} />
          <Route path="/sprouts" element={<Sprouts />} />
          <Route path="/newuser" element={<Newuser />} />
        </Routes>
      </Router>
    </CartProvider>
    </AuthProvider>
  );
};

export default App;*/
/*import React from 'react';
import List from './components/Day5/List';
function App()
{

</>
}
export default App;*/
//day10
/*import React from 'react'
import { BrowserRouter, Route, Routes } from 'react-router-dom';
import Home from './components/Day10/Home';
import Destination from './components/Day10/Destination';
import About from './components/Day10/About';
import Contact from './components/Day10/Contact';
import Registration from './components/Day10/Registration';
import Submitted from './components/Day10/Submitted';
import Navbar from './components/Day10/Navbar';
const App = () => {
 return (
 <div className='App'>
 <BrowserRouter>
 <Navbar />
 <Routes>
 <Route path='/' element={<Home />} />
 <Route path='/destination' element={<Destination />} />
 <Route path='/about' element={<About />} />
 <Route path='/contact' element={<Contact />} />
 <Route path='/registration' element={<Registration />} />
 <Route path='/submittedform' element={<Submitted />} />
 </Routes>
 </BrowserRouter>
 </div>
 )
}
export default App;

  /*function App()
  {
    return(
      <div>
        <Input label="click me" placeholder="placeholder"/>
      </div>
    )
  }export default App;\\input*/
  /*function App()
  {
    return(
      <div>
        <h1>Button example</h1>
        <Button label="Click me" onClick={()=>alert('Button is clicked')} placeholder="place"
        /><br />
        <Button label="Another Button "onClick={()=>alert('Another button clicked')} placeholder="place"/>
      </div>
    )
  }
  export default App;//spread*/

// App.js


  // App.js*/
 /* import {useSelector ,useDispatch} from 'react-redux';
  import { increment } from './components/Redux/Actions';
  import { excrement } from './components/Redux/Actions';
  function App()
  {
    const count = useSelector((state)=>state);
    const dispatch=useDispatch();
return(
  <div>
    <h1>Count: {count}</h1>
    <button onClick={()=>dispatch(increment())}>Increment</button>
    <button onClick={()=>dispatch(excrement())}>Decrement</button>
  </div>
)
  }
  export default App;
/*import React from 'react';
  import About from './components/Rout/About';
  import Home from './components/Rout/Home';
  import Contact from './components/Rout/Contact';
  import {BrowserRouter,Routes,Route,Link} from 'react-router-dom';
  function App()
  {
    return(
     <BrowserRouter>
     <Link to='/'>Home</Link><br />
     <Link to='/about'>About</Link>
     <Routes>
      <Route path='/' element={<Home/>}/>
      <Route path='/about'element={<About/>}/>
<Route path='/contact' element={<Contact/>}/>
     </Routes>
     </BrowserRouter>
    )
  }
  export default App;

// App.js for hof
/*import React from 'react';
import ProductListComponent from './components/Day6/ProductListComponent';
import { WithProductList } from './components/Day6/WithProductList';

const Product = [
  {
    id: 1,
    name: 'Product 1',
    price: 19.99,
    imageUrl: 'images/carrot.jpg',
  },
  {
    id: 2,
    name: 'Product 2',
    price: 20.88,
    imageUrl: 'C:\Users\DELL\myapp\public\images\beetroot.jpg',
  }
];

const EnhancedProductList = WithProductList(ProductListComponent, Product);

function App() {
  return (
    <div>
      <h1>Higher Order Component</h1>
      <EnhancedProductList />
    </div>
  );
}
export default App;*/
/*import React from 'react';
import Get from './components/Day7/Get';
import Hookeffect from './components/Day8/Hookeffect';
import Demobrowserput from './components/Demobrowserput';
import Demoputaxios from './components/Demoputaxios';
import Demopostaxios from './components/Demopostaxios';
import Demobrowserdelete from './components/Demobrowserdelete';
import Demogetinterceptors from './components/Demogetinterceptors';
import MyComponent from './components/MyComponent';
function App()
{
return(
  <div>
    <MyComponent/>
  </div>
)
}
export default App;*/
//day9
/*import React from 'react';
import Home from './components/Day9/Home';
import Singers from './components/Day9/Singers';
import Albumslist from './components/Day9/Albumslist';
import Navbar from './components/Day9/Navbar';
import { BrowserRouter as Router, Route, Routes } from 'react-router-dom';

function App() {
  return (
    <Router>
      <div>
        <Navbar />
        <Routes>
          <Route path="/" element={<Home />} />
          <Route path="/singers" element={<Singers />} />
          <Route path="/albums" element={<Albumslist />} />
        </Routes>
      </div>
    </Router>
  );
}

export default App;*/

// src/App.js for day 6 ph
import React from 'react';
import { BrowserRouter as Router, Routes, Route } from 'react-router-dom';
import Navbar from './components/Day6/Navbar';
import Home from './components/Day6/Home';
import CategoryFilter from './components/Day6/CategoryFilter';
import PriceFilter from './components/Day6/PriceFilter';
import ProductList from './components/Day6/ProductList';
import ProductProvider from './components/Day6/ProductContext';
function App() {
  return (
    <ProductProvider>
      <Router>
        <Navbar />
        <div className="container">
          <Routes>
            <Route path="/" element={<Home />} />
            <Route path="/categories" element={<><CategoryFilter /><PriceFilter /><ProductList /></>} />
            <Route path="/products" element={<ProductList />} />
          </Routes>
        </div>
      </Router>
    </ProductProvider>
  );
}

export default App;
//lab
/*import React from 'react';
import InlineExample from './components/LAB/InlineExample';
import BasicForm from './components/LAB/BasicForm';
import HelloWorld from './components/LAB/HelloWorld';
import Toggle from './components/LAB/Toggle';
import TransformationToggle from './components/LAB/TransformationToggle';
import WeatherApp from './components/LAB/WeatherApp';
import FruitSurvey from './components/LAB/FruitSurvey';
import LoginDialog from './components/LAB/LoginDialog';
import BookList from './components/LAB/BookList';
import LifeCycle from './components/LAB/LifeCycle';
import Demobrowserput from './components/Demobrowserput';
import Demopostaxios from './components/Demopostaxios';
import Demoputaxios from './components/Demoputaxios';
import Reactapp from './components/Reactapp';
function App()
{
  return(
    <div>

<Reactapp/>
</div>
  )
}
export default App;
/*import React from 'react';
import ErrorBoundary from './components/LAB/ErrorBoundary';
import List from './components/LAB/List';
function App() {
  return (
    <div>
      <h1>Welcome to the Frameworks List</h1>
      <ErrorBoundary>
        <List />
      </ErrorBoundary>
    </div>
  );
}

export default App;*/
//error 3



/*import React from 'react';
import Clock from './components/LAB/Clock';

function App() {
  return (
    <div className="App" style={{ textAlign: 'center', fontFamily: 'Arial, sans-serif' }}>
      <header style={{
        backgroundColor: '#333',
        color: '#fff',
        padding: '20px',
        fontSize: '1.5em'
      }}>
        Welcome to the Clock App
      </header>
      <Clock />
    </div>
  );
}

export default App;*/
//contextapi
/*import React from 'react';


import ProductList from './components/LAB/ProductList';
import withProductTransformation from './components/LAB/withProductTransformation';
import { productsData } from './components/LAB/ProductsData';
const applyDiscount = (product) => ({
  ...product,
  price: product.price * 0.8, // 20% discount
});

const applyTax = (product) => ({
  ...product,
  price: product.price * 1.1, // 10% tax
});

const DiscountedProductList = withProductTransformation(ProductList, applyDiscount);
const TaxedProductList = withProductTransformation(ProductList, applyTax);

const App = () => {
  return (
    <div style={{ padding: '20px' }}>
      <h1>Product List</h1>

      <h3>Original Prices</h3>
      <ProductList products={productsData} />

      <h3>Discounted Prices (20% Off)</h3>
      <DiscountedProductList products={productsData} />

      <h3>Prices with Tax (10% Added)</h3>
      <TaxedProductList products={productsData} />
    </div>
  );
};

export default App;*/


