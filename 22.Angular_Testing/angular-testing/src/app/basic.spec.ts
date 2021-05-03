
class Calculator{
  add(a, b){
    return a+b;
  }
  mul(a, b){
    return a*b;
  }
}


describe("Calculator", function () {
  it("should be created", () => {
    console.log("my calculator should be ready");
  })

  describe("should not", function () {
    it("add 2 string", () => {
      console.log("adding 2 strings");
    })
    it("add 2 objects", () => {
      console.log("adding 2 objects");
    })
  })

  describe("should", function () {
    describe("add", function () {
      it("2 positive numbers", () => {
        let a = 6;
        let b = 2;
        let ex = 8;
        
        console.log("adding 2 positive numbers");

        expect(new Calculator().add(a, b)).toBe(ex);

      })
      it("2 negative numbers", () => {
        console.log("adding 2 negative numbers");
      })
      it("1 positive and 1 negative numbers", () => {
        console.log("adding 1 positive and 1 negative numbers");
      })
    })

    describe("multiply", function () {
      it("2 positive numbers", () => {
        console.log("multiplying 2 positive numbers");
      })
    })

  })

})