import React from 'react';
import { shallow } from 'enzyme';
import CohortDetails from './CohortDetails';
import { CohortsData } from './Cohort';

describe('Cohort Details Component', () => {

    let wrapper;

    beforeEach(() => {
        wrapper = shallow(
            <CohortDetails cohort={CohortsData[0]} />
        );
    });

    test('should create the component', () => {
        expect(wrapper.exists()).toBe(true);
    });

    test('should initialize the props', () => {
        expect(wrapper.find('h3').text()).toContain(CohortsData[0].cohortCode);
        expect(wrapper.find('span').text()).toBe(CohortsData[0].technology);
    });

    test('should display cohort code in h3', () => {
        expect(wrapper.find('h3').text()).toContain(CohortsData[0].cohortCode);
    });

    test('should always render same html', () => {
        expect(wrapper).toMatchSnapshot();
    });

});