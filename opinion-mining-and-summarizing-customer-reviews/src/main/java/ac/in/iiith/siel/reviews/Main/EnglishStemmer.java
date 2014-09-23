
package ac.in.iiith.siel.reviews.Main;


public class EnglishStemmer extends SnowballStemmer {

        private final static EnglishStemmer methodObject = new EnglishStemmer ();

                private final static Among a_0[] = {
                    new Among ( "arsen", -1, -1, "", methodObject ),
                    new Among ( "commun", -1, -1, "", methodObject ),
                    new Among ( "gener", -1, -1, "", methodObject )
                };

                private final static Among a_1[] = {
                    new Among ( "'", -1, 1, "", methodObject ),
                    new Among ( "'s'", 0, 1, "", methodObject ),
                    new Among ( "'s", -1, 1, "", methodObject )
                };

                private final static Among a_2[] = {
                    new Among ( "ied", -1, 2, "", methodObject ),
                    new Among ( "s", -1, 3, "", methodObject ),
                    new Among ( "ies", 1, 2, "", methodObject ),
                    new Among ( "sses", 1, 1, "", methodObject ),
                    new Among ( "ss", 1, -1, "", methodObject ),
                    new Among ( "us", 1, -1, "", methodObject )
                };

                private final static Among a_3[] = {
                    new Among ( "", -1, 3, "", methodObject ),
                    new Among ( "bb", 0, 2, "", methodObject ),
                    new Among ( "dd", 0, 2, "", methodObject ),
                    new Among ( "ff", 0, 2, "", methodObject ),
                    new Among ( "gg", 0, 2, "", methodObject ),
                    new Among ( "bl", 0, 1, "", methodObject ),
                    new Among ( "mm", 0, 2, "", methodObject ),
                    new Among ( "nn", 0, 2, "", methodObject ),
                    new Among ( "pp", 0, 2, "", methodObject ),
                    new Among ( "rr", 0, 2, "", methodObject ),
                    new Among ( "at", 0, 1, "", methodObject ),
                    new Among ( "tt", 0, 2, "", methodObject ),
                    new Among ( "iz", 0, 1, "", methodObject )
                };

                private final static Among a_4[] = {
                    new Among ( "ed", -1, 2, "", methodObject ),
                    new Among ( "eed", 0, 1, "", methodObject ),
                    new Among ( "ing", -1, 2, "", methodObject ),
                    new Among ( "edly", -1, 2, "", methodObject ),
                    new Among ( "eedly", 3, 1, "", methodObject ),
                    new Among ( "ingly", -1, 2, "", methodObject )
                };

                private final static Among a_5[] = {
                    new Among ( "anci", -1, 3, "", methodObject ),
                    new Among ( "enci", -1, 2, "", methodObject ),
                    new Among ( "ogi", -1, 13, "", methodObject ),
                    new Among ( "li", -1, 16, "", methodObject ),
                    new Among ( "bli", 3, 12, "", methodObject ),
                    new Among ( "abli", 4, 4, "", methodObject ),
                    new Among ( "alli", 3, 8, "", methodObject ),
                    new Among ( "fulli", 3, 14, "", methodObject ),
                    new Among ( "lessli", 3, 15, "", methodObject ),
                    new Among ( "ousli", 3, 10, "", methodObject ),
                    new Among ( "entli", 3, 5, "", methodObject ),
                    new Among ( "aliti", -1, 8, "", methodObject ),
                    new Among ( "biliti", -1, 12, "", methodObject ),
                    new Among ( "iviti", -1, 11, "", methodObject ),
                    new Among ( "tional", -1, 1, "", methodObject ),
                    new Among ( "ational", 14, 7, "", methodObject ),
                    new Among ( "alism", -1, 8, "", methodObject ),
                    new Among ( "ation", -1, 7, "", methodObject ),
                    new Among ( "ization", 17, 6, "", methodObject ),
                    new Among ( "izer", -1, 6, "", methodObject ),
                    new Among ( "ator", -1, 7, "", methodObject ),
                    new Among ( "iveness", -1, 11, "", methodObject ),
                    new Among ( "fulness", -1, 9, "", methodObject ),
                    new Among ( "ousness", -1, 10, "", methodObject )
                };

                private final static Among a_6[] = {
                    new Among ( "icate", -1, 4, "", methodObject ),
                    new Among ( "ative", -1, 6, "", methodObject ),
                    new Among ( "alize", -1, 3, "", methodObject ),
                    new Among ( "iciti", -1, 4, "", methodObject ),
                    new Among ( "ical", -1, 4, "", methodObject ),
                    new Among ( "tional", -1, 1, "", methodObject ),
                    new Among ( "ational", 5, 2, "", methodObject ),
                    new Among ( "ful", -1, 5, "", methodObject ),
                    new Among ( "ness", -1, 5, "", methodObject )
                };

                private final static Among a_7[] = {
                    new Among ( "ic", -1, 1, "", methodObject ),
                    new Among ( "ance", -1, 1, "", methodObject ),
                    new Among ( "ence", -1, 1, "", methodObject ),
                    new Among ( "able", -1, 1, "", methodObject ),
                    new Among ( "ible", -1, 1, "", methodObject ),
                    new Among ( "ate", -1, 1, "", methodObject ),
                    new Among ( "ive", -1, 1, "", methodObject ),
                    new Among ( "ize", -1, 1, "", methodObject ),
                    new Among ( "iti", -1, 1, "", methodObject ),
                    new Among ( "al", -1, 1, "", methodObject ),
                    new Among ( "ism", -1, 1, "", methodObject ),
                    new Among ( "ion", -1, 2, "", methodObject ),
                    new Among ( "er", -1, 1, "", methodObject ),
                    new Among ( "ous", -1, 1, "", methodObject ),
                    new Among ( "ant", -1, 1, "", methodObject ),
                    new Among ( "ent", -1, 1, "", methodObject ),
                    new Among ( "ment", 15, 1, "", methodObject ),
                    new Among ( "ement", 16, 1, "", methodObject )
                };

                private final static Among a_8[] = {
                    new Among ( "e", -1, 1, "", methodObject ),
                    new Among ( "l", -1, 2, "", methodObject )
                };

                private final static Among a_9[] = {
                    new Among ( "succeed", -1, -1, "", methodObject ),
                    new Among ( "proceed", -1, -1, "", methodObject ),
                    new Among ( "exceed", -1, -1, "", methodObject ),
                    new Among ( "canning", -1, -1, "", methodObject ),
                    new Among ( "inning", -1, -1, "", methodObject ),
                    new Among ( "earring", -1, -1, "", methodObject ),
                    new Among ( "herring", -1, -1, "", methodObject ),
                    new Among ( "outing", -1, -1, "", methodObject )
                };

                private final static Among a_10[] = {
                    new Among ( "andes", -1, -1, "", methodObject ),
                    new Among ( "atlas", -1, -1, "", methodObject ),
                    new Among ( "bias", -1, -1, "", methodObject ),
                    new Among ( "cosmos", -1, -1, "", methodObject ),
                    new Among ( "dying", -1, 3, "", methodObject ),
                    new Among ( "early", -1, 9, "", methodObject ),
                    new Among ( "gently", -1, 7, "", methodObject ),
                    new Among ( "howe", -1, -1, "", methodObject ),
                    new Among ( "idly", -1, 6, "", methodObject ),
                    new Among ( "lying", -1, 4, "", methodObject ),
                    new Among ( "news", -1, -1, "", methodObject ),
                    new Among ( "only", -1, 10, "", methodObject ),
                    new Among ( "singly", -1, 11, "", methodObject ),
                    new Among ( "skies", -1, 2, "", methodObject ),
                    new Among ( "skis", -1, 1, "", methodObject ),
                    new Among ( "sky", -1, -1, "", methodObject ),
                    new Among ( "tying", -1, 5, "", methodObject ),
                    new Among ( "ugly", -1, 8, "", methodObject )
                };

                private static final char g_v[] = {17, 65, 16, 1 };

                private static final char g_v_WXY[] = {1, 17, 65, 208, 1 };

                private static final char g_valid_LI[] = {55, 141, 2 };

        private boolean B_Y_found;
        private int I_p2;
        private int I_p1;

                private void copy_from(EnglishStemmer other) {
                    B_Y_found = other.B_Y_found;
                    I_p2 = other.I_p2;
                    I_p1 = other.I_p1;
                    super.copy_from(other);
                }

                private boolean r_prelude() {
            int v_1;
            int v_2;
            int v_3;
            int v_4;
            int v_5;
                    // (, line 25
                    // unset Y_found, line 26
                    B_Y_found = false;
                    // do, line 27
                    v_1 = cursor;
                    lab0: do {
                        // (, line 27
                        // [, line 27
                        bra = cursor;
                        // literal, line 27
                        if (!(eq_s(1, "'")))
                        {
                            break lab0;
                        }
                        // ], line 27
                        ket = cursor;
                        // delete, line 27
                        slice_del();
                    } while (false);
                    cursor = v_1;
                    // do, line 28
                    v_2 = cursor;
                    lab1: do {
                        // (, line 28
                        // [, line 28
                        bra = cursor;
                        // literal, line 28
                        if (!(eq_s(1, "y")))
                        {
                            break lab1;
                        }
                        // ], line 28
                        ket = cursor;
                        // <-, line 28
                        slice_from("Y");
                        // set Y_found, line 28
                        B_Y_found = true;
                    } while (false);
                    cursor = v_2;
                    // do, line 29
                    v_3 = cursor;
                    lab2: do {
                        // repeat, line 29
                        replab3: while(true)
                        {
                            v_4 = cursor;
                            lab4: do {
                                // (, line 29
                                // goto, line 29
                                golab5: while(true)
                                {
                                    v_5 = cursor;
                                    lab6: do {
                                        // (, line 29
                                        if (!(in_grouping(g_v, 97, 121)))
                                        {
                                            break lab6;
                                        }
                                        // [, line 29
                                        bra = cursor;
                                        // literal, line 29
                                        if (!(eq_s(1, "y")))
                                        {
                                            break lab6;
                                        }
                                        // ], line 29
                                        ket = cursor;
                                        cursor = v_5;
                                        break golab5;
                                    } while (false);
                                    cursor = v_5;
                                    if (cursor >= limit)
                                    {
                                        break lab4;
                                    }
                                    cursor++;
                                }
                                // <-, line 29
                                slice_from("Y");
                                // set Y_found, line 29
                                B_Y_found = true;
                                continue replab3;
                            } while (false);
                            cursor = v_4;
                            break replab3;
                        }
                    } while (false);
                    cursor = v_3;
                    return true;
                }

                private boolean r_mark_regions() {
            int v_1;
            int v_2;
                    // (, line 32
                    I_p1 = limit;
                    I_p2 = limit;
                    // do, line 35
                    v_1 = cursor;
                    lab0: do {
                        // (, line 35
                        // or, line 41
                        lab1: do {
                            v_2 = cursor;
                            lab2: do {
                                // among, line 36
                                if (find_among(a_0, 3) == 0)
                                {
                                    break lab2;
                                }
                                break lab1;
                            } while (false);
                            cursor = v_2;
                            // (, line 41
                            // gopast, line 41
                            golab3: while(true)
                            {
                                lab4: do {
                                    if (!(in_grouping(g_v, 97, 121)))
                                    {
                                        break lab4;
                                    }
                                    break golab3;
                                } while (false);
                                if (cursor >= limit)
                                {
                                    break lab0;
                                }
                                cursor++;
                            }
                            // gopast, line 41
                            golab5: while(true)
                            {
                                lab6: do {
                                    if (!(out_grouping(g_v, 97, 121)))
                                    {
                                        break lab6;
                                    }
                                    break golab5;
                                } while (false);
                                if (cursor >= limit)
                                {
                                    break lab0;
                                }
                                cursor++;
                            }
                        } while (false);
                        // setmark p1, line 42
                        I_p1 = cursor;
                        // gopast, line 43
                        golab7: while(true)
                        {
                            lab8: do {
                                if (!(in_grouping(g_v, 97, 121)))
                                {
                                    break lab8;
                                }
                                break golab7;
                            } while (false);
                            if (cursor >= limit)
                            {
                                break lab0;
                            }
                            cursor++;
                        }
                        // gopast, line 43
                        golab9: while(true)
                        {
                            lab10: do {
                                if (!(out_grouping(g_v, 97, 121)))
                                {
                                    break lab10;
                                }
                                break golab9;
                            } while (false);
                            if (cursor >= limit)
                            {
                                break lab0;
                            }
                            cursor++;
                        }
                        // setmark p2, line 43
                        I_p2 = cursor;
                    } while (false);
                    cursor = v_1;
                    return true;
                }

                private boolean r_shortv() {
            int v_1;
                    // (, line 49
                    // or, line 51
                    lab0: do {
                        v_1 = limit - cursor;
                        lab1: do {
                            // (, line 50
                            if (!(out_grouping_b(g_v_WXY, 89, 121)))
                            {
                                break lab1;
                            }
                            if (!(in_grouping_b(g_v, 97, 121)))
                            {
                                break lab1;
                            }
                            if (!(out_grouping_b(g_v, 97, 121)))
                            {
                                break lab1;
                            }
                            break lab0;
                        } while (false);
                        cursor = limit - v_1;
                        // (, line 52
                        if (!(out_grouping_b(g_v, 97, 121)))
                        {
                            return false;
                        }
                        if (!(in_grouping_b(g_v, 97, 121)))
                        {
                            return false;
                        }
                        // atlimit, line 52
                        if (cursor > limit_backward)
                        {
                            return false;
                        }
                    } while (false);
                    return true;
                }

                private boolean r_R1() {
                    if (!(I_p1 <= cursor))
                    {
                        return false;
                    }
                    return true;
                }

                private boolean r_R2() {
                    if (!(I_p2 <= cursor))
                    {
                        return false;
                    }
                    return true;
                }

                private boolean r_Step_1a() {
            int among_var;
            int v_1;
            int v_2;
                    // (, line 58
                    // try, line 59
                    v_1 = limit - cursor;
                    lab0: do {
                        // (, line 59
                        // [, line 60
                        ket = cursor;
                        // substring, line 60
                        among_var = find_among_b(a_1, 3);
                        if (among_var == 0)
                        {
                            cursor = limit - v_1;
                            break lab0;
                        }
                        // ], line 60
                        bra = cursor;
                        switch(among_var) {
                            case 0:
                                cursor = limit - v_1;
                                break lab0;
                            case 1:
                                // (, line 62
                                // delete, line 62
                                slice_del();
                                break;
                        }
                    } while (false);
                    // [, line 65
                    ket = cursor;
                    // substring, line 65
                    among_var = find_among_b(a_2, 6);
                    if (among_var == 0)
                    {
                        return false;
                    }
                    // ], line 65
                    bra = cursor;
                    switch(among_var) {
                        case 0:
                            return false;
                        case 1:
                            // (, line 66
                            // <-, line 66
                            slice_from("ss");
                            break;
                        case 2:
                            // (, line 68
                            // or, line 68
                            lab1: do {
                                v_2 = limit - cursor;
                                lab2: do {
                                    // (, line 68
                                    // hop, line 68
                                    {
                                        int c = cursor - 2;
                                        if (limit_backward > c || c > limit)
                                        {
                                            break lab2;
                                        }
                                        cursor = c;
                                    }
                                    // <-, line 68
                                    slice_from("i");
                                    break lab1;
                                } while (false);
                                cursor = limit - v_2;
                                // <-, line 68
                                slice_from("ie");
                            } while (false);
                            break;
                        case 3:
                            // (, line 69
                            // next, line 69
                            if (cursor <= limit_backward)
                            {
                                return false;
                            }
                            cursor--;
                            // gopast, line 69
                            golab3: while(true)
                            {
                                lab4: do {
                                    if (!(in_grouping_b(g_v, 97, 121)))
                                    {
                                        break lab4;
                                    }
                                    break golab3;
                                } while (false);
                                if (cursor <= limit_backward)
                                {
                                    return false;
                                }
                                cursor--;
                            }
                            // delete, line 69
                            slice_del();
                            break;
                    }
                    return true;
                }

                private boolean r_Step_1b() {
            int among_var;
            int v_1;
            int v_3;
            int v_4;
                    // (, line 74
                    // [, line 75
                    ket = cursor;
                    // substring, line 75
                    among_var = find_among_b(a_4, 6);
                    if (among_var == 0)
                    {
                        return false;
                    }
                    // ], line 75
                    bra = cursor;
                    switch(among_var) {
                        case 0:
                            return false;
                        case 1:
                            // (, line 77
                            // call R1, line 77
                            if (!r_R1())
                            {
                                return false;
                            }
                            // <-, line 77
                            slice_from("ee");
                            break;
                        case 2:
                            // (, line 79
                            // test, line 80
                            v_1 = limit - cursor;
                            // gopast, line 80
                            golab0: while(true)
                            {
                                lab1: do {
                                    if (!(in_grouping_b(g_v, 97, 121)))
                                    {
                                        break lab1;
                                    }
                                    break golab0;
                                } while (false);
                                if (cursor <= limit_backward)
                                {
                                    return false;
                                }
                                cursor--;
                            }
                            cursor = limit - v_1;
                            // delete, line 80
                            slice_del();
                            // test, line 81
                            v_3 = limit - cursor;
                            // substring, line 81
                            among_var = find_among_b(a_3, 13);
                            if (among_var == 0)
                            {
                                return false;
                            }
                            cursor = limit - v_3;
                            switch(among_var) {
                                case 0:
                                    return false;
                                case 1:
                                    // (, line 83
                                    // <+, line 83
                                    {
                                        int c = cursor;
                                        insert(cursor, cursor, "e");
                                        cursor = c;
                                    }
                                    break;
                                case 2:
                                    // (, line 86
                                    // [, line 86
                                    ket = cursor;
                                    // next, line 86
                                    if (cursor <= limit_backward)
                                    {
                                        return false;
                                    }
                                    cursor--;
                                    // ], line 86
                                    bra = cursor;
                                    // delete, line 86
                                    slice_del();
                                    break;
                                case 3:
                                    // (, line 87
                                    // atmark, line 87
                                    if (cursor != I_p1)
                                    {
                                        return false;
                                    }
                                    // test, line 87
                                    v_4 = limit - cursor;
                                    // call shortv, line 87
                                    if (!r_shortv())
                                    {
                                        return false;
                                    }
                                    cursor = limit - v_4;
                                    // <+, line 87
                                    {
                                        int c = cursor;
                                        insert(cursor, cursor, "e");
                                        cursor = c;
                                    }
                                    break;
                            }
                            break;
                    }
                    return true;
                }

                private boolean r_Step_1c() {
            int v_1;
            int v_2;
                    // (, line 93
                    // [, line 94
                    ket = cursor;
                    // or, line 94
                    lab0: do {
                        v_1 = limit - cursor;
                        lab1: do {
                            // literal, line 94
                            if (!(eq_s_b(1, "y")))
                            {
                                break lab1;
                            }
                            break lab0;
                        } while (false);
                        cursor = limit - v_1;
                        // literal, line 94
                        if (!(eq_s_b(1, "Y")))
                        {
                            return false;
                        }
                    } while (false);
                    // ], line 94
                    bra = cursor;
                    if (!(out_grouping_b(g_v, 97, 121)))
                    {
                        return false;
                    }
                    // not, line 95
                    {
                        v_2 = limit - cursor;
                        lab2: do {
                            // atlimit, line 95
                            if (cursor > limit_backward)
                            {
                                break lab2;
                            }
                            return false;
                        } while (false);
                        cursor = limit - v_2;
                    }
                    // <-, line 96
                    slice_from("i");
                    return true;
                }

                private boolean r_Step_2() {
            int among_var;
                    // (, line 99
                    // [, line 100
                    ket = cursor;
                    // substring, line 100
                    among_var = find_among_b(a_5, 24);
                    if (among_var == 0)
                    {
                        return false;
                    }
                    // ], line 100
                    bra = cursor;
                    // call R1, line 100
                    if (!r_R1())
                    {
                        return false;
                    }
                    switch(among_var) {
                        case 0:
                            return false;
                        case 1:
                            // (, line 101
                            // <-, line 101
                            slice_from("tion");
                            break;
                        case 2:
                            // (, line 102
                            // <-, line 102
                            slice_from("ence");
                            break;
                        case 3:
                            // (, line 103
                            // <-, line 103
                            slice_from("ance");
                            break;
                        case 4:
                            // (, line 104
                            // <-, line 104
                            slice_from("able");
                            break;
                        case 5:
                            // (, line 105
                            // <-, line 105
                            slice_from("ent");
                            break;
                        case 6:
                            // (, line 107
                            // <-, line 107
                            slice_from("ize");
                            break;
                        case 7:
                            // (, line 109
                            // <-, line 109
                            slice_from("ate");
                            break;
                        case 8:
                            // (, line 111
                            // <-, line 111
                            slice_from("al");
                            break;
                        case 9:
                            // (, line 112
                            // <-, line 112
                            slice_from("ful");
                            break;
                        case 10:
                            // (, line 114
                            // <-, line 114
                            slice_from("ous");
                            break;
                        case 11:
                            // (, line 116
                            // <-, line 116
                            slice_from("ive");
                            break;
                        case 12:
                            // (, line 118
                            // <-, line 118
                            slice_from("ble");
                            break;
                        case 13:
                            // (, line 119
                            // literal, line 119
                            if (!(eq_s_b(1, "l")))
                            {
                                return false;
                            }
                            // <-, line 119
                            slice_from("og");
                            break;
                        case 14:
                            // (, line 120
                            // <-, line 120
                            slice_from("ful");
                            break;
                        case 15:
                            // (, line 121
                            // <-, line 121
                            slice_from("less");
                            break;
                        case 16:
                            // (, line 122
                            if (!(in_grouping_b(g_valid_LI, 99, 116)))
                            {
                                return false;
                            }
                            // delete, line 122
                            slice_del();
                            break;
                    }
                    return true;
                }

                private boolean r_Step_3() {
            int among_var;
                    // (, line 126
                    // [, line 127
                    ket = cursor;
                    // substring, line 127
                    among_var = find_among_b(a_6, 9);
                    if (among_var == 0)
                    {
                        return false;
                    }
                    // ], line 127
                    bra = cursor;
                    // call R1, line 127
                    if (!r_R1())
                    {
                        return false;
                    }
                    switch(among_var) {
                        case 0:
                            return false;
                        case 1:
                            // (, line 128
                            // <-, line 128
                            slice_from("tion");
                            break;
                        case 2:
                            // (, line 129
                            // <-, line 129
                            slice_from("ate");
                            break;
                        case 3:
                            // (, line 130
                            // <-, line 130
                            slice_from("al");
                            break;
                        case 4:
                            // (, line 132
                            // <-, line 132
                            slice_from("ic");
                            break;
                        case 5:
                            // (, line 134
                            // delete, line 134
                            slice_del();
                            break;
                        case 6:
                            // (, line 136
                            // call R2, line 136
                            if (!r_R2())
                            {
                                return false;
                            }
                            // delete, line 136
                            slice_del();
                            break;
                    }
                    return true;
                }

                private boolean r_Step_4() {
            int among_var;
            int v_1;
                    // (, line 140
                    // [, line 141
                    ket = cursor;
                    // substring, line 141
                    among_var = find_among_b(a_7, 18);
                    if (among_var == 0)
                    {
                        return false;
                    }
                    // ], line 141
                    bra = cursor;
                    // call R2, line 141
                    if (!r_R2())
                    {
                        return false;
                    }
                    switch(among_var) {
                        case 0:
                            return false;
                        case 1:
                            // (, line 144
                            // delete, line 144
                            slice_del();
                            break;
                        case 2:
                            // (, line 145
                            // or, line 145
                            lab0: do {
                                v_1 = limit - cursor;
                                lab1: do {
                                    // literal, line 145
                                    if (!(eq_s_b(1, "s")))
                                    {
                                        break lab1;
                                    }
                                    break lab0;
                                } while (false);
                                cursor = limit - v_1;
                                // literal, line 145
                                if (!(eq_s_b(1, "t")))
                                {
                                    return false;
                                }
                            } while (false);
                            // delete, line 145
                            slice_del();
                            break;
                    }
                    return true;
                }

                private boolean r_Step_5() {
            int among_var;
            int v_1;
            int v_2;
                    // (, line 149
                    // [, line 150
                    ket = cursor;
                    // substring, line 150
                    among_var = find_among_b(a_8, 2);
                    if (among_var == 0)
                    {
                        return false;
                    }
                    // ], line 150
                    bra = cursor;
                    switch(among_var) {
                        case 0:
                            return false;
                        case 1:
                            // (, line 151
                            // or, line 151
                            lab0: do {
                                v_1 = limit - cursor;
                                lab1: do {
                                    // call R2, line 151
                                    if (!r_R2())
                                    {
                                        break lab1;
                                    }
                                    break lab0;
                                } while (false);
                                cursor = limit - v_1;
                                // (, line 151
                                // call R1, line 151
                                if (!r_R1())
                                {
                                    return false;
                                }
                                // not, line 151
                                {
                                    v_2 = limit - cursor;
                                    lab2: do {
                                        // call shortv, line 151
                                        if (!r_shortv())
                                        {
                                            break lab2;
                                        }
                                        return false;
                                    } while (false);
                                    cursor = limit - v_2;
                                }
                            } while (false);
                            // delete, line 151
                            slice_del();
                            break;
                        case 2:
                            // (, line 152
                            // call R2, line 152
                            if (!r_R2())
                            {
                                return false;
                            }
                            // literal, line 152
                            if (!(eq_s_b(1, "l")))
                            {
                                return false;
                            }
                            // delete, line 152
                            slice_del();
                            break;
                    }
                    return true;
                }

                private boolean r_exception2() {
                    ket = cursor;
                    if (find_among_b(a_9, 8) == 0)
                    {
                        return false;
                    }
                    bra = cursor;
                    if (cursor > limit_backward)
                    {
                        return false;
                    }
                    return true;
                }

                private boolean r_exception1() {
            int among_var;
                    bra = cursor;
                    among_var = find_among(a_10, 18);
                    if (among_var == 0)
                    {
                        return false;
                    }
                    ket = cursor;
                    if (cursor < limit)
                    {
                        return false;
                    }
                    switch(among_var) {
                        case 0:
                            return false;
                        case 1:
                            slice_from("ski");
                            break;
                        case 2:
                            slice_from("sky");
                            break;
                        case 3:
                            slice_from("die");
                            break;
                        case 4:
                            slice_from("lie");
                            break;
                        case 5:
                            slice_from("tie");
                            break;
                        case 6:
                            slice_from("idl");
                            break;
                        case 7:
                            slice_from("gentl");
                            break;
                        case 8:
                            slice_from("ugli");
                            break;
                        case 9:
                            slice_from("earli");
                            break;
                        case 10:
                            slice_from("onli");
                            break;
                        case 11:
                            slice_from("singl");
                            break;
                    }
                    return true;
                }

                private boolean r_postlude() {
            int v_1;
            int v_2;
                    if (!(B_Y_found))
                    {
                        return false;
                    }
                    replab0: while(true)
                    {
                        v_1 = cursor;
                        lab1: do {
                            golab2: while(true)
                            {
                                v_2 = cursor;
                                lab3: do {
                                    bra = cursor;
                                    if (!(eq_s(1, "Y")))
                                    {
                                        break lab3;
                                    }
                                    ket = cursor;
                                    cursor = v_2;
                                    break golab2;
                                } while (false);
                                cursor = v_2;
                                if (cursor >= limit)
                                {
                                    break lab1;
                                }
                                cursor++;
                            }
                            slice_from("y");
                            continue replab0;
                        } while (false);
                        cursor = v_1;
                        break replab0;
                    }
                    return true;
                }

                public boolean stem() {
            int v_1;
            int v_2;
            int v_3;
            int v_4;
            int v_5;
            int v_6;
            int v_7;
            int v_8;
            int v_9;
            int v_10;
            int v_11;
            int v_12;
            int v_13;
                    lab0: do {
                        v_1 = cursor;
                        lab1: do {
                            if (!r_exception1())
                            {
                                break lab1;
                            }
                            break lab0;
                        } while (false);
                        cursor = v_1;
                        lab2: do {
                            {
                                v_2 = cursor;
                                lab3: do {
                                    {
                                        int c = cursor + 3;
                                        if (0 > c || c > limit)
                                        {
                                            break lab3;
                                        }
                                        cursor = c;
                                    }
                                    break lab2;
                                } while (false);
                                cursor = v_2;
                            }
                            break lab0;
                        } while (false);
                        cursor = v_1;
                        // (, line 208
                        // do, line 209
                        v_3 = cursor;
                        lab4: do {
                            // call prelude, line 209
                            if (!r_prelude())
                            {
                                break lab4;
                            }
                        } while (false);
                        cursor = v_3;
                        v_4 = cursor;
                        lab5: do {
                            if (!r_mark_regions())
                            {
                                break lab5;
                            }
                        } while (false);
                        cursor = v_4;
                        limit_backward = cursor; cursor = limit;
                        v_5 = limit - cursor;
                        lab6: do {
                            if (!r_Step_1a())
                            {
                                break lab6;
                            }
                        } while (false);
                        cursor = limit - v_5;
                        lab7: do {
                            v_6 = limit - cursor;
                            lab8: do {
                                if (!r_exception2())
                                {
                                    break lab8;
                                }
                                break lab7;
                            } while (false);
                            cursor = limit - v_6;
                            v_7 = limit - cursor;
                            lab9: do {
                                if (!r_Step_1b())
                                {
                                    break lab9;
                                }
                            } while (false);
                            cursor = limit - v_7;
                            v_8 = limit - cursor;
                            lab10: do {
                                if (!r_Step_1c())
                                {
                                    break lab10;
                                }
                            } while (false);
                            cursor = limit - v_8;
                            v_9 = limit - cursor;
                            lab11: do {
                                if (!r_Step_2())
                                {
                                    break lab11;
                                }
                            } while (false);
                            cursor = limit - v_9;
                            // do, line 221
                            v_10 = limit - cursor;
                            lab12: do {
                                if (!r_Step_3())
                                {
                                    break lab12;
                                }
                            } while (false);
                            cursor = limit - v_10;
                            v_11 = limit - cursor;
                            lab13: do {
                                if (!r_Step_4())
                                {
                                    break lab13;
                                }
                            } while (false);
                            cursor = limit - v_11;
                            v_12 = limit - cursor;
                            lab14: do {
                                if (!r_Step_5())
                                {
                                    break lab14;
                                }
                            } while (false);
                            cursor = limit - v_12;
                        } while (false);
                        cursor = limit_backward;                       
                        v_13 = cursor;
                        lab15: do {
                            if (!r_postlude())
                            {
                                break lab15;
                            }
                        } while (false);
                        cursor = v_13;
                    } while (false);
                    return true;
                }

        public boolean equals( Object o ) {
            return o instanceof EnglishStemmer;
        }

        public int hashCode() {
            return EnglishStemmer.class.getName().hashCode();
        }



}

