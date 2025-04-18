const Test = require('@codewars/test-compat');

describe("Basic Tests", function(){
    it("It should works for basic tests.", function(){

        Test.assertEquals(checkRange([2, 5, 6, 7, 1, 3, 4, 11, 56, 49],1,7),7)

        Test.assertEquals(checkRange([2, 5, 6, 7, 1, 3, 4, 11, 56, 49],3,5),3)

        Test.assertEquals(checkRange([2, 5, 6, 7, 1, 3, 4, 11, 56, 49],7,10),1)

        Test.assertEquals(checkRange([7, 5, 11, 8, 9, 1, 13, 12, 88],99,100),0)

        Test.assertEquals(checkRange([12, 1, 45, 56, 98, 14, 23, 46],14,14),1)

        Test.assertEquals(checkRange([1, 1, 1, 99, 99, 99],88,88),0)

    })})