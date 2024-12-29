import codewars_test as test
from solution import b91encode, b91decode

@test.describe('BasE91')
def tests():
    def do_test_enc(strng, expected):
        test.assert_equals(b91encode(strng), expected, f'b91encode({strng})')

    def do_test_dec(strng, expected):
        test.assert_equals(b91decode(strng), expected, f'b91decode({strng})')

    @test.describe('Basic tests')
    def basic_tests():
        @test.it('Encoding')
        def basic_tests_enc():
            do_test_enc('test', 'fPNKd')
            do_test_enc('Hello World!', '>OwJh>Io0Tv!8PE')
            do_test_enc('', '')

        @test.it('Decoding')
        def basic_tests_dec():
            do_test_dec('fPNKd','test')
            do_test_dec('>OwJh>Io0Tv!8PE','Hello World!')
            do_test_dec('', '')
