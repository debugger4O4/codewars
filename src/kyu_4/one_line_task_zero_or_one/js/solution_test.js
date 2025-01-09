const Test = require('@codewars/test-compat');

describe("Basic Tests", function(){
    it("It should works for basic tests.", function(){

        Test.assertDeepEquals(zeroOrOne(1,[[1,1,0,1]]),[1, 1, 0, 1])

        Test.assertDeepEquals(zeroOrOne(3,[
            [1,0,1,0,1],
            [1,0,1,0,1],
            [0,1,0,1,0]]),[1, 0, 1, 0, 1])

        Test.assertDeepEquals(zeroOrOne(3,[
            [1,0,1,0,1],
            [1,1,1,0,1],
            [0,1,1,1,0]]),[1, 1, 1, 0, 1])

        Test.assertDeepEquals(zeroOrOne(5,[
            [1,0,0,0,0],
            [0,1,0,0,0],
            [0,0,1,0,0],
            [0,0,0,1,0],
            [0,0,0,0,1]]),[0, 0, 0, 0, 0])

    })})