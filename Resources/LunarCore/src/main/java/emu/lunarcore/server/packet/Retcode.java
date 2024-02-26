package emu.lunarcore.server.packet;

import lombok.Getter;

@Getter
public enum Retcode {
    SUCC (0),
    FAIL (1),
    SERVER_INTERNAL_ERROR (2),
    TIMEOUT (3),
    REPEATED_REQ (4),
    REQ_PARA_INVALID (5),
    PLAYER_DATA_ERROR (6),
    PLAYER_CLIENT_PAUSED (7),
    FUNC_CHECK_FAILED (8),
    FEATURE_SWITCH_CLOSED (9),
    FREQ_OVER_LIMIT (10),
    SYSTEM_BUSY (11),
    REPEATE_LOGIN (1000),
    RETRY_LOGIN (1001),
    WAIT_LOGIN (1002),
    NOT_IN_WHITE_LIST (1003),
    IN_BLACK_LIST (1004),
    ACCOUNT_VERIFY_ERROR (1005),
    ACCOUNT_PARA_ERROR (1006),
    ANTI_ADDICT_LOGIN (1007),
    CHECK_SUM_ERROR (1008),
    REACH_MAX_PLAYER_NUM (1009),
    ALREADY_REGISTERED (1010),
    GENDER_ERROR (1011),
    RETCODE_SET_NICKNAME_RET_CALLBACK_PROCESSING (1012),
    IN_GM_BIND_ACCESS (1013),
    QUEST_REWARD_ALREADY_TAKEN (1100),
    QUEST_NOT_ACCEPT (1101),
    QUEST_NOT_FINISH (1102),
    QUEST_STATUS_ERROR (1103),
    ACHIEVEMENT_LEVEL_NOT_REACH (1104),
    ACHIEVEMENT_LEVEL_ALREADY_TAKEN (1105),
    AVATAR_NOT_EXIST (1200),
    AVATAR_RES_EXP_NOT_ENOUGH (1201),
    AVATAR_EXP_REACH_PROMOTION_LIMIT (1202),
    AVATAR_REACH_MAX_PROMOTION (1203),
    SKILLTREE_CONFIG_NOT_EXIST (1204),
    SKILLTREE_ALREADY_UNLOCK (1205),
    SKILLTREE_PRE_LOCKED (1206),
    SKILLTREE_LEVEL_NOT_MEET (1207),
    SKILLTREE_RANK_NOT_MEET (1208),
    AVATAR_DRESS_NO_EQUIPMENT (1209),
    AVATAR_EXP_ITEM_NOT_EXIST (1210),
    SKILLTREE_POINT_UNLOCK (1211),
    SKILLTREE_POINT_LEVEL_UPGRADE_NOT_MATCH (1212),
    SKILLTREE_POINT_LEVEL_REACH_MAX (1213),
    WORLD_LEVEL_NOT_MEET (1214),
    PLAYER_LEVEL_NOT_MEET (1215),
    AVATAR_RANK_NOT_MATCH (1216),
    AVATAR_RANK_REACH_MAX (1217),
    HERO_BASIC_TYPE_NOT_MATCH (1218),
    AVATAR_PROMOTION_NOT_MEET (1219),
    PROMOTION_REWARD_CONFIG_NOT_EXIST (1220),
    PROMOTION_REWARD_ALREADY_TAKEN (1221),
    ITEM_NOT_EXIST (1300),
    ITEM_COST_NOT_ENOUGH (1301),
    ITEM_COST_TOO_MUCH (1302),
    ITEM_NO_COST (1303),
    ITEM_NOT_ENOUGH (1304),
    ITEM_INVALID (1305),
    ITEM_CONFIG_NOT_EXIST (1306),
    SCOIN_NOT_ENOUGH (1307),
    ITEM_REWARD_EXCEED_LIMIT (1308),
    ITEM_INVALID_USE (1309),
    ITEM_USE_CONFIG_NOT_EXIST (1310),
    REWARD_CONFIG_NOT_EXIST (1311),
    ITEM_EXCEED_LIMIT (1312),
    ITEM_COUNT_INVALID (1313),
    ITEM_USE_TARGET_TYPE_INVALID (1314),
    ITEM_USE_SATIETY_FULL (1315),
    ITEM_COMPOSE_NOT_EXIST (1316),
    RELIC_COMPOSE_NOT_EXIST (1317),
    ITEM_CAN_NOT_SELL (1318),
    ITEM_SELL_EXCEDD_LIMIT (1319),
    ITEM_NOT_IN_COST_LIST (1320),
    ITEM_SPECIAL_COST_NOT_ENOUGH (1321),
    ITEM_SPECIAL_COST_TOO_MUCH (1322),
    ITEM_FORMULA_NOT_EXIST (1323),
    ITEM_AUTO_GIFT_OPTIONAL_NOT_EXIST (1324),
    RELIC_COMPOSE_RELIC_INVALID (1325),
    RELIC_COMPOSE_MAIN_AFFIX_ID_INVALID (1326),
    RELIC_COMPOSE_WRONG_FORMULA_TYPE (1327),
    RELIC_COMPOSE_RELIC_NOT_EXIST (1328),
    RELIC_COMPOSE_BLACK_GOLD_COUNT_INVALID (1329),
    RELIC_COMPOSE_BLACK_GOLD_NOT_NEED (1330),
    MONTH_CARD_CANNOT_USE (1331),
    ITEM_REWARD_EXCEED_DISAPPEAR (1332),
    ITEM_NEED_RECYCLE (1333),
    ITEM_COMPOSE_EXCEED_LIMIT (1334),
    EQUIPMENT_ALREADY_DRESSED (1350),
    EQUIPMENT_NOT_EXIST (1351),
    EQUIPMENT_REACH_LEVEL_LIMIT (1352),
    EQUIPMENT_CONSUME_SELF (1353),
    EQUIPMENT_ALREADY_LOCKED (1354),
    EQUIPMENT_ALREADY_UNLOCKED (1355),
    EQUIPMENT_LOCKED (1356),
    EQUIPMENT_SELECT_NUM_OVER_LIMIT (1357),
    EQUIPMENT_RANK_UP_MUST_CONSUME_SAME_TID (1358),
    EQUIPMENT_PROMOTION_REACH_MAX (1359),
    EQUIPMENT_RANK_UP_REACH_MAX (1360),
    EQUIPMENT_LEVEL_REACH_MAX (1361),
    EQUIPMENT_EXCEED_LIMIT (1362),
    RELIC_NOT_EXIST (1363),
    RELIC_REACH_LEVEL_LIMIT (1364),
    RELIC_CONSUME_SELF (1365),
    RELIC_ALREADY_DRESSED (1366),
    RELIC_LOCKED (1367),
    RELIC_ALREADY_LOCKED (1368),
    RELIC_ALREADY_UNLOCKED (1369),
    RELIC_LEVEL_IS_NOT_ZERO (1370),
    UNIQUE_ID_REPEATED (1371),
    EQUIPMENT_LEVEL_NOT_MEET (1372),
    EQUIPMENT_ITEM_NOT_IN_COST_LIST (1373),
    EQUIPMENT_LEVEL_GREATER_THAN_ONE (1374),
    EQUIPMENT_ALREADY_RANKED (1375),
    RELIC_EXCEED_LIMIT (1376),
    LINEUP_INVALID_INDEX (1400),
    LINEUP_INVALID_MEMBER_POS (1401),
    LINEUP_SWAP_NOT_EXIST (1402),
    LINEUP_AVATAR_ALREADY_IN (1403),
    LINEUP_CREATE_AVATAR_ERROR (1404),
    LINEUP_AVATAR_INIT_ERROR (1405),
    LINEUP_NOT_EXIST (1406),
    LINEUP_ONLY_ONE_MEMBER (1407),
    LINEUP_SAME_LEADER_SLOT (1408),
    LINEUP_NO_LEADER_SELECT (1409),
    LINEUP_SWAP_SAME_SLOT (1410),
    LINEUP_AVATAR_NOT_EXIST (1411),
    LINEUP_TRIAL_AVATAR_CAN_NOT_QUIT (1412),
    LINEUP_VIRTUAL_LINEUP_PLANE_NOT_MATCH (1413),
    LINEUP_NOT_VALID_LEADER (1414),
    LINEUP_SAME_INDEX (1415),
    LINEUP_IS_EMPTY (1416),
    LINEUP_NAME_FORMAT_ERROR (1417),
    LINEUP_TYPE_NOT_MATCH (1418),
    LINEUP_REPLACE_ALL_FAILED (1419),
    LINEUP_NOT_ALLOW_EDIT (1420),
    LINEUP_AVATAR_IS_ALIVE (1421),
    LINEUP_ASSIST_HAS_ONLY_MEMBER (1422),
    LINEUP_ASSIST_CANNOT_SWITCH (1423),
    LINEUP_AVATAR_TYPE_INVALID (1424),
    LINEUP_NAME_UTF8_ERROR (1425),
    LINEUP_LEADER_LOCK (1426),
    MAIL_NOT_EXIST (1700),
    MAIL_RANGE_INVALID (1701),
    MAIL_MAIL_ID_INVALID (1702),
    MAIL_NO_MAIL_TAKE_ATTACHMENT (1703),
    MAIL_NO_MAIL_TO_DEL (1704),
    MAIL_TYPE_INVALID (1705),
    MAIL_PARA_INVALID (1706),
    MAIL_ATTACHEMENT_INVALID (1707),
    MAIL_TICKET_INVALID (1708),
    MAIL_TICKET_REPEATED (1709),
    STAGE_SETTLE_ERROR (1800),
    STAGE_CONFIG_NOT_EXIST (1801),
    STAGE_NOT_FOUND (1802),
    STAGE_COCOON_PROP_NOT_VALID (1804),
    STAGE_COCOON_WAVE_NOT_VALID (1805),
    STAGE_PROP_ID_NOT_EQUAL (1806),
    STAGE_COCOON_WAVE_OVER (1807),
    STAGE_WEEK_COCOON_OVER_CNT (1808),
    STAGE_COCOON_NOT_OPEN (1809),
    STAGE_TRIAL_NOT_OPEN (1810),
    CHAPTER_LOCK (1900),
    CHAPTER_CHALLENGE_NUM_NOT_ENOUGH (1901),
    CHAPTER_REWARD_ID_NOT_EXIST (1902),
    CHAPTER_REWARD_ALREADY_TAKEN (1903),
    BATTLE_STAGE_NOT_MATCH (2000),
    IN_BATTLE_NOW (2001),
    BATTLE_CHEAT (2002),
    BATTLE_FAIL (2003),
    BATTLE_NO_LINEUP (2004),
    BATTLE_LINEUP_EMPTY (2005),
    BATTLE_VERSION_NOT_MATCH (2006),
    BATTLE_QUIT_BY_SERVER (2007),
    IN_BATTLE_CHECK (2008),
    BATTLE_CHECK_NEED_RETRY (2009),
    BATTLE_COST_TIME_CHECK_FAIL (2010),
    LACK_EXCHANGE_STAMINA_TIMES (2100),
    LACK_STAMINA (2101),
    STAMINA_FULL (2102),
    AUTHKEY_SIGN_TYPE_ERROR (2103),
    AUTHKEY_SIGN_VER_ERROR (2104),
    NICKNAME_FORMAT_ERROR (2105),
    SENSITIVE_WORDS (2106),
    LEVEL_REWARD_HAS_TAKEN (2107),
    LEVEL_REWARD_LEVEL_ERROR (2108),
    LANGUAGE_INVALID (2109),
    NICKNAME_IN_CD (2110),
    GAMEPLAY_BIRTHDAY_INVALID (2111),
    GAMEPLAY_BIRTHDAY_ALREADY_SET (2112),
    NICKNAME_UTF8_ERROR (2113),
    NICKNAME_DIGIT_LIMIT_ERROR (2114),
    SENSITIVE_WORDS_PLATFORM_ERROR (2115),
    MAZE_LACK_TICKET (2201),
    MAZE_NOT_UNLOCK (2202),
    MAZE_NO_ABILITY (2204),
    MAZE_NO_PLANE (2205),
    MAZE_MAP_NOT_EXIST (2207),
    MAZE_MP_NOT_ENOUGH (2213),
    SPRING_NOT_ENABLE (2214),
    SPRING_TOO_FAR (2216),
    NOT_IN_MAZE (2218),
    MAZE_TIME_OF_DAY_TYPE_ERROR (2223),
    PLOT_NOT_UNLOCK (2300),
    MISSION_NOT_EXIST (2400),
    MISSION_ALREADY_DONE (2401),
    DAILY_TASK_NOT_FINISH (2402),
    DAILY_TASK_REWARD_HAS_TAKEN (2403),
    MISSION_NOT_FINISH (2404),
    MISSION_NOT_DOING (2405),
    MISSION_FINISH_WAY_NOT_MATCH (2406),
    MISSION_SCENE_NOT_MATCH (2407),
    MISSION_CUSTOM_VALUE_NOT_VALID (2408),
    MISSION_SUB_MISSION_NOT_MATCH (2409),
    ADVENTURE_MAP_NOT_EXIST (2500),
    SCENE_ENTITY_NOT_EXIST (2600),
    NOT_IN_SCENE (2601),
    SCENE_MONSTER_NOT_EXIST (2602),
    INTERACT_CONFIG_NOT_EXIST (2603),
    UNSUPPORTED_PROP_STATE (2604),
    SCENE_ENTRY_ID_NOT_MATCH (2605),
    SCENE_ENTITY_MOVE_CHECK_FAILED (2606),
    ASSIST_MONSTER_COUNT_LIMIT (2607),
    SCENE_USE_SKILL_FAIL (2608),
    PROP_IS_HIDDEN (2609),
    LOADING_SUCC_ALREADY (2610),
    SCENE_ENTITY_TYPE_INVALID (2611),
    INTERACT_TYPE_INVALID (2612),
    INTERACT_NOT_IN_REGION (2613),
    INTERACT_SUB_TYPE_INVALID (2614),
    NOT_LEADER_ENTITY (2615),
    MONSTER_IS_NOT_FARM_ELEMENT (2616),
    MONSTER_CONFIG_NOT_EXIST (2617),
    AVATAR_HP_ALREADY_FULL (2618),
    CUR_INTERACT_ENTITY_NOT_MATCH (2619),
    PLANE_TYPE_NOT_ALLOW (2620),
    GROUP_NOT_EXIST (2621),
    GROUP_SAVE_DATA_IN_CD (2622),
    GROUP_SAVE_LENGH_REACH_MAX (2623),
    RECENT_ELEMENT_NOT_EXIST (2624),
    RECENT_ELEMENT_STAGE_NOT_MATCH (2625),
    SCENE_POSITION_VERSION_NOT_MATCH (2626),
    BUY_TIMES_LIMIT (2700),
    BUY_LIMIT_TYPE (2701),
    SHOP_NOT_OPEN (2702),
    GOODS_NOT_OPEN (2703),
    CITY_LEVEL_REWARD_TAKEN (2704),
    CITY_LEVEL_NOT_MEET (2705),
    SINGLE_BUY_LIMIT (2706),
    TUTORIAL_NOT_UNLOCK (2751),
    TUTORIAL_UNLOCK_ALREADY (2752),
    TUTORIAL_FINISH_ALREADY (2753),
    TUTORIAL_PRE_NOT_UNLOCK (2754),
    TUTORIAL_PLAYER_LEVEL_NOT_MATCH (2755),
    TUTORIAL_TUTORIAL_NOT_FOUND (2756),
    CHALLENGE_NOT_EXIST (2801),
    CHALLENGE_NOT_UNLOCK (2802),
    CHALLENGE_ALREADY (2803),
    CHALLENGE_LINEUP_EDIT_FORBIDDEN (2804),
    CHALLENGE_LINEUP_EMPTY (2805),
    CHALLENGE_NOT_DOING (2806),
    CHALLENGE_NOT_FINISH (2807),
    CHALLENGE_TARGET_NOT_FINISH (2808),
    CHALLENGE_TARGET_REWARD_TAKEN (2809),
    CHALLENGE_TIME_NOT_VALID (2810),
    CHALLENGE_STARS_COUNT_NOT_MEET (2811),
    CHALLENGE_STARS_REWARD_TAKEN (2812),
    CHALLENGE_STARS_NOT_EXIST (2813),
    BASIC_TYPE_ALREADY (2850),
    NO_BASIC_TYPE (2851),
    NOT_CHOOSE_BASIC_TYPE (2852),
    NOT_FUNC_CLOSE (2853),
    NOT_CHOOSE_GENDER (2854),
    ROGUE_STATUS_NOT_MATCH (2901),
    ROGUE_SELECT_BUFF_NOT_EXIST (2902),
    ROGUE_COIN_NOT_ENOUGH (2903),
    ROGUE_STAMINA_NOT_ENOUGH (2904),
    ROGUE_APPRAISAL_COUNT_NOT_ENOUGH (2905),
    ROGUE_PROP_ALREADY_USED (2906),
    ROGUE_RECORD_ALREADY_SAVED (2907),
    ROGUE_ROLL_BUFF_MAX_COUNT (2908),
    ROGUE_PICK_AVATAR_INVALID (2909),
    ROGUE_QUEST_EXPIRE (2910),
    ROGUE_QUEST_REWARD_ALREADY (2911),
    ROGUE_REVIVE_COUNT_NOT_ENOUGH (2912),
    ROGUE_AREA_INVALID (2913),
    ROGUE_SCORE_REWARD_POOL_INVALID (2914),
    ROGUE_SCORE_REWARD_ROW_INVALID (2915),
    ROGUE_AEON_LEVEL_NOT_MEET (2916),
    ROGUE_AEON_LEVEL_REWARD_ALREADY_TAKEN (2917),
    ROGUE_AEON_CONFIG_NOT_EXIST (2918),
    ROGUE_TRIAL_AVATAR_INVALID (2919),
    ROGUE_HANDBOOK_REWARD_ALREADY_TAKEN (2920),
    MISSION_EVENT_CONFIG_NOT_EXIST (2951),
    MISSION_EVENT_NOT_CLIENT (2952),
    MISSION_EVENT_FINISHED (2953),
    MISSION_EVENT_DOING (2954),
    HAS_CHALLENGE_MISSION_EVENT (2955),
    NOT_CHALLENGE_MISSION_EVENT (2956),
    GACHA_ID_NOT_EXIST (3001),
    GACHA_NUM_INVALID (3002),
    GACHA_FIRST_GACHA_MUST_ONE (3003),
    GACHA_REQ_DUPLICATED (3004),
    GACHA_NOT_IN_SCHEDULE (3005),
    GACHA_NEWBIE_CLOSE (3006),
    GACHA_TODAY_LIMITED (3007),
    GACHA_NOT_SUPPORT (3008),
    GACHA_CEILING_NOT_ENOUGH (3009),
    GACHA_CEILING_CLOSE (3010),
    NOT_IN_RAID (3101),
    RAID_DOING (3102),
    NOT_PROP (3103),
    RAID_ID_NOT_MATCH (3104),
    RAID_RESTART_NOT_MATCH (3105),
    RAID_LIMIT (3106),
    RAID_AVATAR_LIST_EMPTY (3107),
    RAID_AVATAR_NOT_EXIST (3108),
    CHALLENGE_RAID_REWARD_ALREADY (3109),
    CHALLENGE_RAID_SCORE_NOT_REACH (3110),
    CHALLENGE_RAID_NOT_OPEN (3111),
    RAID_FINISHED (3112),
    RAID_WORLD_LEVEL_NOT_LOCK (3113),
    RAID_CANNOT_USE_ASSIST (3114),
    RAID_AVATAR_NOT_MATCH (3115),
    RAID_CAN_NOT_SAVE (3116),
    RAID_NO_SAVE (3117),
    ACTIVITY_RAID_NOT_OPEN (3118),
    TALK_EVENT_ALREADY_TAKEN (3151),
    NPC_ALREADY_MEET (3152),
    NPC_NOT_IN_CONFIG (3153),
    DIALOGUE_GROUP_DISMATCH (3154),
    DIALOGUE_EVENT_INVALID (3155),
    TALK_EVENT_TAKE_PROTO_NOT_MATCH (3156),
    TALK_EVENT_NOT_VALID (3157),
    EXPEDITION_CONFIG_NOT_EXIST (3201),
    EXPEDITION_REWARD_CONFIG_NOT_EXIST (3202),
    EXPEDITION_NOT_UNLOCKED (3203),
    EXPEDITION_ALREADY_ACCEPTED (3204),
    EXPEDITION_REPEATED_AVATAR (3205),
    AVATAR_ALREADY_DISPATCHED (3206),
    EXPEDITION_NOT_ACCEPTED (3207),
    EXPEDITION_NOT_FINISH (3208),
    EXPEDITION_ALREADY_FINISH (3209),
    EXPEDITION_TEAM_COUNT_LIMIT (3210),
    EXPEDITION_AVATAR_NUM_NOT_MATCH (3211),
    LOGIN_ACTIVITY_HAS_TAKEN (3301),
    LOGIN_ACTIVITY_DAYS_LACK (3302),
    TRIAL_ACTIVITY_REWARD_ALREADY_TAKE (3303),
    TRIAL_ACTIVITY_STAGE_NOT_FINISH (3304),
    MONSTER_RESEARCH_ACTIVITY_HAS_TAKEN (3305),
    MONSTER_RESEARCH_ACTIVITY_MATERIAL_NOT_SUBMITTED (3306),
    MONSTER_RESEARCH_ACTIVITY_MATERIAL_ALREADY_SUBMITTED (3307),
    MESSAGE_CONFIG_NOT_EXIST (3501),
    MESSAGE_SECTION_NOT_TAKE (3502),
    MESSAGE_GROUP_NOT_TAKE (3503),
    MESSAGE_SECTION_ID_NOT_MATCH (3504),
    MESSAGE_SECTION_CAN_NOT_FINISH (3505),
    MESSAGE_ITEM_CAN_NOT_FINISH (3506),
    MESSAGE_ITEM_RAID_CAN_NOT_FINISH (3507),
    FRIEND_ALREADY_IS_FRIEND (3601),
    FRIEND_IS_NOT_FRIEND (3602),
    FRIEND_APPLY_EXPIRE (3603),
    FRIEND_IN_BLACKLIST (3604),
    FRIEND_NOT_IN_BLACKLIST (3605),
    FRIEND_NUMBER_LIMIT (3606),
    FRIEND_BLACKLIST_NUMBER_LIMIT (3607),
    FRIEND_DAILY_APPLY_LIMIT (3608),
    FRIEND_IN_HANDLE_LIMIT (3609),
    FRIEND_APPLY_IN_CD (3610),
    FRIEND_REMARK_NAME_FORMAT_ERROR (3611),
    FRIEND_PLAYER_NOT_FOUND (3612),
    FRIEND_IN_TARGET_BLACKLIST (3613),
    FRIEND_TARGET_NUMBER_LIMIT (3614),
    ASSIST_QUERY_TOO_FAST (3615),
    ASSIST_NOT_EXIST (3616),
    ASSIST_USED_ALREADY (3617),
    FRIEND_REPORT_REASON_FORMAT_ERROR (3618),
    FRIEND_REPORT_SENSITIVE_WORDS (3619),
    ASSIST_USED_TIMES_OVER (3620),
    ASSIST_QUIT_ALREADY (3621),
    ASSIST_AVATAR_IN_LINEUP (3622),
    ASSIST_NO_REWARD (3623),
    FRIEND_SEARCH_NUM_LIMIT (3624),
    FRIEND_SEARCH_IN_CD (3625),
    FRIEND_REMARK_NAME_UTF8_ERROR (3626),
    FRIEND_REPORT_REASON_UTF8_ERROR (3627),
    ASSIST_SET_ALREADY (3628),
    PLAYER_BOARD_HEAD_ICON_NOT_EXIST (3701),
    PLAYER_BOARD_HEAD_ICON_LOCKED (3702),
    PLAYER_BOARD_HEAD_ICON_ALREADY_UNLOCKED (3703),
    PLAYER_BOARD_DISPLAY_AVATAR_NOT_EXIST (3704),
    PLAYER_BOARD_DISPLAY_AVATAR_EXCEED_LIMIT (3705),
    PLAYER_BOARD_DISPLAY_REPEATED_AVATAR (3706),
    PLAYER_BOARD_DISPLAY_AVATAR_SAME_POS (3707),
    PLAYER_BOARD_DISPLAY_AVATAR_LOCKED (3708),
    SIGNATURE_LENGTH_EXCEED_LIMIT (3709),
    SIGNATURE_SENSITIVE_WORDS (3710),
    PLAYER_BOARD_ASSIST_AVATAR_NOT_EXIST (3712),
    PLAYER_BOARD_ASSIST_AVATAR_LOCKED (3713),
    SIGNATURE_UTF8_ERROR (3714),
    BATTLE_PASS_TIER_NOT_VALID (3801),
    BATTLE_PASS_LEVEL_NOT_MEET (3802),
    BATTLE_PASS_REWARD_TAKE_ALREADY (3803),
    BATTLE_PASS_NOT_PREMIUM (3804),
    BATTLE_PASS_NOT_DOING (3805),
    BATTLE_PASS_LEVEL_INVALID (3806),
    BATTLE_PASS_NOT_UNLOCK (3807),
    BATTLE_PASS_NO_REWARD (3808),
    BATTLE_PASS_QUEST_NOT_VALID (3809),
    BATTLE_PASS_NOT_CHOOSE_OPTIONAL (3810),
    BATTLE_PASS_NOT_TAKE_REWARD (3811),
    BATTLE_PASS_OPTIONAL_NOT_VALID (3812),
    BATTLE_PASS_BUY_ALREADY (3813),
    BATTLE_PASS_NEAR_END (3814),
    MUSIC_LOCKED (3901),
    MUSIC_NOT_EXIST (3902),
    MUSIC_UNLOCK_FAILED (3903),
    PUNK_LORD_LACK_SUMMON_TIMES (4001),
    PUNK_LORD_ATTACKING_MONSTER_LIMIT (4002),
    PUNK_LORD_MONSTER_NOT_EXIST (4003),
    PUNK_LORD_MONSTER_ALREADY_SHARED (4004),
    PUNK_LORD_MONSTER_EXPIRED (4005),
    PUNK_LORD_SELF_MONSTER_ATTACK_LIMIT (4006),
    PUNK_LORD_LACK_SUPPORT_TIMES (4007),
    PUNK_LORD_MONSTER_ALREADY_KILLED (4008),
    PUNK_LORD_MONSTER_ATTACKER_LIMIT (4009),
    PUNK_LORD_WORLD_LEVLE_NOT_VALID (4010),
    PUNK_LORD_REWARD_LEVLE_NOT_EXIST (4011),
    PUNK_LORD_POINT_NOT_MEET (4012),
    PUNK_LORD_IN_ATTACKING (4013),
    PUNK_LORD_OPERATION_IN_CD (4014),
    PUNK_LORD_REWARD_ALREADY_TAKEN (4015),
    PUNK_LORD_OVER_BONUS_REWARD_LIMIT (4016),
    PUNK_LORD_NOT_IN_SCHEDULE (4017),
    PUNK_LORD_MONSTER_NOT_ATTACKED (4018),
    PUNK_LORD_MONSTER_NOT_KILLED (4019),
    PUNK_LORD_MONSTER_KILLED_SCORE_ALREADY_TAKE (4020),
    PUNK_LORD_REWARD_LEVLE_ALREADY_TAKE (4021),
    DAILY_ACTIVE_LEVEL_INVALID (4101),
    DAILY_ACTIVE_LEVEL_REWARD_ALREADY_TAKEN (4102),
    DAILY_ACTIVE_LEVEL_AP_NOT_ENOUGH (4103),
    DAILY_MEET_PAM (4201),
    REPLAY_ID_NOT_MATCH (4251),
    REPLAY_REQ_NOT_VALID (4252),
    FIGHT_ACTIVITY_DIFFICULTY_LEVEL_NOT_PASSED (4301),
    FIGHT_ACTIVITY_DIFFICULTY_LEVEL_REWARD_ALREADY_TAKE (4302),
    FIGHT_ACTIVITY_STAGE_NOT_OPEN (4303),
    TRAIN_VISITOR_VISITOR_NOT_EXIST (4351),
    TRAIN_VISITOR_BEHAVIOR_NOT_EXIST (4352),
    TRAIN_VISITOR_BEHAVIOR_FINISHED (4353),
    TEXT_JOIN_UNKNOW_IS_OVERRIDE (4401),
    TEXT_JOIN_ID_NOT_EXIST (4402),
    TEXT_JOIN_CAN_NOT_OVERRIDE (4403),
    TEXT_JOIN_ITEM_ID_ERROR (4404),
    TEXT_JOIN_SENSITIVE_CHECK_ERROR (4405),
    TEXT_JOIN_MUST_OVERRIDE (4406),
    TEXT_JOIN_TEXT_EMPTY (4407),
    TEXT_JOIN_TEXT_FORMAT_ERROR (4408),
    TEXT_JOIN_TEXT_UTF8_ERROR (4409),
    PAM_MISSION_MISSION_ID_ERROR (4451),
    PAM_MISSION_MISSION_EXPIRE (4452),
    CHAT_TYPE_NOT_EXIST (4501),
    MSG_TYPE_NOT_EXIST (4502),
    CHAT_NO_TARGET_UID (4503),
    CHAT_MSG_EMPTY (4504),
    CHAT_MSG_EXCEED_LIMIT (4505),
    CHAT_MSG_SENSITIVE_CHECK_ERROR (4506),
    CHAT_MSG_UTF8_ERROR (4507),
    CHAT_FORBID_SWITCH_OPEN (4508),
    CHAT_FORBID (4509),
    CHAT_MSG_INCLUDE_SPECIAL_STR (4510),
    BOXING_CLUB_CHALLENGE_NOT_OPEN (4601),
    MUSEUM_NOT_OPEN (4651),
    MUSEUM_TURN_CNT_NOT_MATCH (4652),
    MUSEUM_PHASE_NOT_REACH (4653),
    MUSEUM_UNKNOW_STUFF (4654),
    MUSEUM_UNKNOW_AREA (4655),
    MUSEUM_UNKNOW_POS (4656),
    MUSEUM_STUFF_ALREADY_IN_AREA (4657),
    MUSEUM_STUFF_NOT_IN_AREA (4658),
    MUSEUM_GET_NPC_REPEAT (4659),
    MUSEUM_GET_NPC_UNLOCK (4660),
    MUSEUM_GET_NPC_NOT_ENOUGH (4661),
    MUSEUM_CHANGE_STUFF_AREA_ERROR (4662),
    MUSEUM_NOT_INIT (4663),
    MUSEUM_EVENT_ERROR (4664),
    MUSEUM_UNKNOW_CHOOSE_EVENT_ID (4665),
    MUSEUM_EVENT_ORDER_NOT_MATCH (4666),
    MUSEUM_EVENT_PHASE_NOT_UNLOCK (4667),
    MUSEUM_EVENT_MISSION_NOT_FOUND (4668),
    MUSEUM_AREA_LEVEL_UP_ALREADY (4669),
    MUSEUM_STUFF_ALREADY_USED (4670),
    MUSEUM_EVENT_ROUND_NOT_UNLOCK (4671),
    MUSEUM_STUFF_IN_AREA (4672),
    MUSEUM_STUFF_DISPATCH (4673),
    MUSEUM_IS_END (4674),
    MUSEUM_STUFF_LEAVING (4675),
    MUSEUM_EVENT_MISSION_NOT_FINISH (4678),
    MUSEUM_COLLECT_REWARD_NOT_EXIST (4679),
    MUSEUM_COLLECT_REWARD_ALREADY_TAKEN (4680),
    MUSEUM_ACCEPT_MISSION_MAX_LIMIT (4681);
    
    private final int val;
    
    private Retcode(int val) {
        this.val = val;
    }
}
