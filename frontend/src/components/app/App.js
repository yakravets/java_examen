import React from "react";
import {
  BrowserRouter as Router,
  Switch,
  Route,
  Link
} from "react-router-dom";
import './App.css';

export default function App() {
  return (
    <Router>
      <div class="scrollmenu">
        <nav>
          <ul>
            <li>
              <Link to="/">Home</Link>
            </li>
            <li>
              <Link to="/trips">Trips</Link>
            </li>
            <li>
              <Link to="/airports">Airports</Link>
            </li>
            <li>
              <Link to="/aircraft">Aircraft</Link>
            </li>
            <li>
              <Link to="/about">About</Link>
            </li>
          </ul>
        </nav> 
      </div>       
      <Switch>
        <Route path="/about">
          <About />
        </Route>
        <Route path="/trips">
          <Trips />
        </Route>
        <Route path="/airports">
          <Airports/>
        </Route>
        <Route path="/aircraft">
          <Aircraft/>
        </Route>
        <Route path="/">
          <Home />
        </Route>
      </Switch>    
    </Router>
  );
}

function Home() {
  return <h2>Home</h2>;
}

function About() {
  return <h2>About</h2>;
}

function Trips() {
  return <h2>Trips</h2>;
}

function Airports() {
  return <h2>Airports</h2>;
}

function Aircraft() {
  return <h2>Aircraft</h2>;
}