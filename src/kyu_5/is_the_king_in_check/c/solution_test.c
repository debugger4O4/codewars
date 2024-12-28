#include <stdbool.h>
#include <stdio.h>
#include <criterion/criterion.h>

extern bool king_is_in_check(const char chessboard[8][8]);
static void do_test(const char chessboard[8][8], bool expected);

Test(sample_tests, pawn_check)
{
	do_test((char[8][8]) {
		"        ",
		"        ",
		"        ",
		"        ",
		"        ",
		" P      ",
		"K       ",
		"        "
	}, true);
}

Test(sample_tests, bishop_check)
{
	do_test((char[8][8]) {
		"       K",
		"        ",
		"        ",
		"        ",
		"        ",
		"        ",
		"        ",
		"B       "
	}, true);
}

Test(sample_tests, rook_check)
{
	do_test((char[8][8]) {
		"        ",
		"        ",
		"        ",
		"    K   ",
		"        ",
		"        ",
		"        ",
		"    R   "
	}, true);
}

Test(sample_tests, knight_check)
{
	do_test((char[8][8]) {
		"        ",
		"        ",
		"        ",
		"        ",
		"        ",
		" K      ",
		"        ",
		"N       "
	}, true);
}

Test(sample_tests, king_alone)
{
	do_test((char[8][8]) {
		"        ",
		"        ",
		"  K     ",
		"        ",
		"        ",
		"        ",
		"        ",
		"        "
	}, false);
}

Test(sample_tests, no_check)
{
	do_test((char[8][8]) {
		"        ",
		"        ",
		"        ",
		"Q  N   Q",
		"   K    ",
		"        ",
		"        ",
		"        "
	}, false);
}

Test(sample_tests, no_line_of_sight)
{
	do_test((char[8][8]) {
		"   B    ",
		"        ",
		"  K     ",
		"  N     ",
		"    P   ",
		"        ",
		"      Q ",
		"        "
	}, false);
}

static char *stringify_chessboard (char *str, const char chessboard[8][8])
{
	char *ptr = str;
	ptr += sprintf(ptr, "|---|---|---|---|---|---|---|---|\n");

	for (int row = 0; row < 8; row++) {
		for (int col = 0; col < 8; col++) {
			unsigned char square = chessboard[row][col];
			ptr += sprintf(ptr, "| %s ",
				(const char *[]) {
					['K'] = "♔", ['Q'] = "♛", ['B'] = "♝", ['N'] = "♞",
					['R'] = "♜", ['P'] = "♟", [' '] = " "
				}[square]
			);
		}
		ptr += sprintf(ptr, "|\n|---|---|---|---|---|---|---|---|\n");
	}
	return str;
}

static void do_test(const char chessboard[8][8], bool expected)
{
	char *chessboard_string = stringify_chessboard((char[1024]){""}, chessboard);
	bool actual = king_is_in_check(chessboard);

	cr_assert_eq(actual, expected,
		"Expected %s for chessboard:\n%s",
		expected ? "true" : "false", chessboard_string
	);
}