const Test = require('@codewars/test-compat');

describe("Basic Tests", function(){
    it("It should works for basic tests.", function(){

        Test.assertEquals(timedReading(4,"The Fox asked the stork, 'How is the soup?'"),7)

        Test.assertEquals(timedReading(1,"..."),0)

        Test.assertEquals(timedReading(3,"This play was good for us."),3)

        Test.assertEquals(timedReading(3,"Suddenly he stopped, and glanced up at the houses"),5)

        Test.assertEquals(timedReading(6,"Zebras evolved among the Old World horses within the last four million years."),11)

        Test.assertEquals(timedReading(5,"Although zebra species may have overlapping ranges, they do not interbreed."),6)

        Test.assertEquals(timedReading(1,"Oh!"),0)

        Test.assertEquals(timedReading(5,"Now and then, however, he is horribly thoughtless, and seems to take a real delight in giving me pain."),14)

    })})