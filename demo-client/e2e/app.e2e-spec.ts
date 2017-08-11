import { DemoCientPage } from './app.po';

describe('demo-client App', () => {
  let page: DemoCientPage;

  beforeEach(() => {
    page = new DemoCientPage();
  });

  it('should display message saying app works', () => {
    page.navigateTo();
    expect(page.getParagraphText()).toEqual('app works!');
  });
});
