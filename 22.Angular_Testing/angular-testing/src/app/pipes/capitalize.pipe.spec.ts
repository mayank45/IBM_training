import { CapitalizePipe } from './capitalize.pipe';

describe('CapitalizePipe', () => {
  it('create an instance', () => {
    const pipe = new CapitalizePipe();
    expect(pipe).toBeTruthy();
  });

  it("should convert 'aRUn' into 'Arun'", ()=>{
    const pipe = new CapitalizePipe();
    expect(pipe.transform('aRUn')).toBe('Arun');
  })
});

