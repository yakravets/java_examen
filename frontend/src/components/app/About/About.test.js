import React from "react";

import { configure } from "enzyme";
import Adapter from "enzyme-adapter-react-16";
configure({ adapter: new Adapter() });

import { shallow, mount } from "enzyme";
import About from './About';
import toJson from "enzyme-to-json";

it("renders correctly", () => {
    const tree = shallow(<About />);
    expect(toJson(tree)).toMatchSnapshot();
  });

it("renders without crashing", () => {
    shallow(<About />);
});
