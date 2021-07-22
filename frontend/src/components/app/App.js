import React from 'react';
import {
  BrowserRouter as Router,
  Switch,
  Route,
  Link
} from "react-router-dom";
import 'antd/dist/antd.css';
import './App.css';
import { Menu } from 'antd';
import { MailOutlined, AppstoreOutlined } from '@ant-design/icons';
import { AiOutlineInfoCircle } from "react-icons/ai";
import { GiCommercialAirplane } from "react-icons/gi";
import { MdAirlineSeatReclineExtra } from "react-icons/md";
import { FaRegListAlt } from "react-icons/fa";

import { PageHeader } from 'antd';

import { Input, Space } from 'antd';
import { AudioOutlined } from '@ant-design/icons';

import { DatePicker } from 'antd';

import { Button } from 'antd';
import { SearchOutlined } from '@ant-design/icons';
import { GrMenu } from 'react-icons/gr';

import { Divider } from 'antd';
import { Layout } from 'antd';
import PageCarousel from './PageCarousel/PageCarousel';

const { Search } = Input;

const suffix = (
  <AudioOutlined
    style={{
      fontSize: 16,
      color: '#1890ff',
    }}
  />
);

const onSearch = value => console.log(value);

export default class App extends React.Component {
  state = {
    current: 'mail',
  };

  handleClick = e => {
    console.log('click ', e);
    this.setState({ current: e.key });
  };

  render() {
    const { current } = this.state;
    return (
      <Router>
        <Menu onClick={this.handleClick} selectedKeys={[current]} mode="horizontal">
          <Menu.Item key="home" icon={<GrMenu />}>
            <Link to="/">Home</Link>
          </Menu.Item>
          <Menu.Item key="trips" icon={<FaRegListAlt />}>
            <Link to="/trips">Trips</Link>
          </Menu.Item>
          <Menu.Item key="airports" icon={<MdAirlineSeatReclineExtra />}>
            <Link to="/airports">Airports</Link>
          </Menu.Item>
          <Menu.Item key="aircraft" icon={<GiCommercialAirplane />}>
            <Link to="/aircraft">Aircraft</Link>
          </Menu.Item>
          <Menu.Item key="about" icon={<AiOutlineInfoCircle/>}>
            <Link to="/about">About</Link>
          </Menu.Item>
        </Menu>
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
}

function onChange(date, dateString) {
  console.log(date, dateString);
}

function Home() {
  return (
  <>
  <div className="content">
    
      {/* <PageCarousel className="pagecarousel"/> */}
    <Layout>
      <Space className="space_main">
        <Layout direction="vertical">
          <Divider orientation="left">From:</Divider>
          <Space>
            <Search size="large" placeholder="From" onSearch={onSearch} style={{ width: 200 }} />
            <DatePicker size="large" onChange={onChange} />
          </Space>
        </Layout>
        <Layout direction="vertical">
          <Divider orientation="left">To:</Divider>
          <Space>
            <Search size="large" placeholder="To" onSearch={onSearch} style={{ width: 200 }} />
            <DatePicker size="large" onChange={onChange} />
            <Button  size="large" type="primary" icon={<SearchOutlined />} success>
              Search
            </Button>
          </Space>
        </Layout>        
      </Space>      
    </Layout>      
  </div>
  </>);
}

function About() {
  return (
    <>
      <PageHeader
        className="site-page-header"
        onBack={() => window.history.back()}
        title="About"
        subTitle="Non comercial project. With love to you."
      />
    </>);
}

function Trips() {
  return (
    <>
      <PageHeader
        className="site-page-header"
        onBack={() => window.history.back()}
        title="Trips"
        subTitle="List all trips"
      />
    </>);
}

function Airports() {
  return (
    <>
      <PageHeader
        className="site-page-header"
        onBack={() => window.history.back()}
        title="Airports"
        subTitle="List all airports"
      />
    </>);
}

function Aircraft() {
  return (
  <>
    <PageHeader
      className="site-page-header"
      onBack={() => window.history.back()}
      title="Aircraft"
      subTitle="List all aircrafts"
    />
  </>);
}