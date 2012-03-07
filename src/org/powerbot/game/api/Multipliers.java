package org.powerbot.game.api;

import java.util.Map;

/**
 * Holds the values of multipliers for normalized integer values from accessed client fields.
 *
 * @author Timer
 */
public class Multipliers {
	public final int
			BASEDATA_X, BASEDATA_Y, GLOBAL_CAMERAPITCH,
			GLOBAL_CAMERAYAW, GLOBAL_CAMPOSX, GLOBAL_CAMPOSY,
			GLOBAL_CAMPOSZ, CHARACTER_HEIGHT, CHARACTER_HPRATIO,
			CHARACTER_INTERACTING, CHARACTER_ISMOVING, CHARACTER_LOOPCYCLESTATUS,
			CHARACTER_ORIENTATION, GLOBAL_DESTX, GLOBAL_DESTY,
			DETAILINFO_LEVEL, GROUNDDATA_X, GROUNDDATA_Y,
			GLOBAL_GUIINTERFACEINDEX, INTERFACE_BORDERTHICKNESS, INTERFACE_BOUNDSARRAYINDEX,
			INTERFACE_COMPONENTID, INTERFACE_COMPONENTINDEX, INTERFACE_COMPONENTSTACKSIZE,
			INTERFACE_HEIGHT, INTERFACE_HORIZONTALSCROLLBARSIZE, INTERFACE_HORIZONTALSCROLLBARTHUMBPOSITION,
			INTERFACE_HORIZONTALSCROLLBARTHUMBSIZE, INTERFACE_ID, INTERFACE_MODELID,
			INTERFACE_MODELTYPE, INTERFACE_MODELZOOM, INTERFACE_PARENTID,
			INTERFACE_SHADOWCOLOR, INTERFACE_SPECIALTYPE, INTERFACE_TEXTCOLOR,
			INTERFACE_TEXTUREID, INTERFACE_TYPE, INTERFACE_VERTICALSCROLLBARSIZE,
			INTERFACE_VERTICALSCROLLBARTHUMBPOSITION, INTERFACE_VERTICALSCROLLBARTHUMBSIZE, INTERFACE_WIDTH,
			INTERFACE_X, INTERFACE_XROTATION, INTERFACE_Y,
			INTERFACE_YROTATION, INTERFACE_ZROTATION, INTERFACENODE_MAINID,
			ITEM_ID, ITEM_STACKSIZE, ITEMDEF_ID,
			GLOBAL_LOGININDEX, GLOBAL_LOOPCYCLE, MENUGROUPNODE_SIZE,
			GLOBAL_MENUHEIGHT, GLOBAL_MENUOPTIONSCOUNT, GLOBAL_MENUOPTIONSCOUNTCOLLAPSED,
			GLOBAL_MENUWIDTH, GLOBAL_MENUX, GLOBAL_MENUY,
			GLOBAL_MINIMAPOFFSET, GLOBAL_MINIMAPSCALE, GLOBAL_MINIMAPSETTING,
			NODE_ID, NODE_ID_p2, NPC_LEVEL,
			NPCDEF_ID, GLOBAL_NPCCOUNT, OBJECTDEF_ID,
			GLOBAL_PLANE, PLAYER_LEVEL, PLAYER_PRAYERICON,
			PLAYER_SKULLICON, PLAYER_TEAM, PLAYERCOMPOSITE_NPCID,
			GLOBAL_PLAYERCOUNT, GLOBAL_SELECTEDITEMID, SEQUENCE_ID,
			SERVERDATA_WORLDID, GLOBAL_SUBMENUWIDTH, GLOBAL_SUBMENUX,
			GLOBAL_SUBMENUY;

	public Multipliers(final Map<Integer, Integer> multipliers) {
		BASEDATA_X = multipliers.get(200);
		BASEDATA_Y = multipliers.get(201);
		GLOBAL_CAMERAPITCH = multipliers.get(300);
		GLOBAL_CAMERAYAW = multipliers.get(301);
		GLOBAL_CAMPOSX = multipliers.get(302);
		GLOBAL_CAMPOSY = multipliers.get(303);
		GLOBAL_CAMPOSZ = multipliers.get(304);
		CHARACTER_HEIGHT = multipliers.get(305);
		CHARACTER_HPRATIO = multipliers.get(306);
		CHARACTER_INTERACTING = multipliers.get(307);
		CHARACTER_ISMOVING = multipliers.get(308);
		CHARACTER_LOOPCYCLESTATUS = multipliers.get(309);
		CHARACTER_ORIENTATION = multipliers.get(310);
		GLOBAL_DESTX = multipliers.get(400);
		GLOBAL_DESTY = multipliers.get(401);
		DETAILINFO_LEVEL = multipliers.get(402);
		GROUNDDATA_X = multipliers.get(700);
		GROUNDDATA_Y = multipliers.get(701);
		GLOBAL_GUIINTERFACEINDEX = multipliers.get(702);
		INTERFACE_BORDERTHICKNESS = multipliers.get(900);
		INTERFACE_BOUNDSARRAYINDEX = multipliers.get(901);
		INTERFACE_COMPONENTID = multipliers.get(902);
		INTERFACE_COMPONENTINDEX = multipliers.get(903);
		INTERFACE_COMPONENTSTACKSIZE = multipliers.get(904);
		INTERFACE_HEIGHT = multipliers.get(905);
		INTERFACE_HORIZONTALSCROLLBARSIZE = multipliers.get(906);
		INTERFACE_HORIZONTALSCROLLBARTHUMBPOSITION = multipliers.get(907);
		INTERFACE_HORIZONTALSCROLLBARTHUMBSIZE = multipliers.get(908);
		INTERFACE_ID = multipliers.get(909);
		INTERFACE_MODELID = multipliers.get(910);
		INTERFACE_MODELTYPE = multipliers.get(911);
		INTERFACE_MODELZOOM = multipliers.get(912);
		INTERFACE_PARENTID = multipliers.get(913);
		INTERFACE_SHADOWCOLOR = multipliers.get(914);
		INTERFACE_SPECIALTYPE = multipliers.get(915);
		INTERFACE_TEXTCOLOR = multipliers.get(916);
		INTERFACE_TEXTUREID = multipliers.get(917);
		INTERFACE_TYPE = multipliers.get(918);
		INTERFACE_VERTICALSCROLLBARSIZE = multipliers.get(919);
		INTERFACE_VERTICALSCROLLBARTHUMBPOSITION = multipliers.get(920);
		INTERFACE_VERTICALSCROLLBARTHUMBSIZE = multipliers.get(921);
		INTERFACE_WIDTH = multipliers.get(922);
		INTERFACE_X = multipliers.get(923);
		INTERFACE_XROTATION = multipliers.get(924);
		INTERFACE_Y = multipliers.get(925);
		INTERFACE_YROTATION = multipliers.get(926);
		INTERFACE_ZROTATION = multipliers.get(927);
		INTERFACENODE_MAINID = multipliers.get(928);
		ITEM_ID = multipliers.get(929);
		ITEM_STACKSIZE = multipliers.get(930);
		ITEMDEF_ID = multipliers.get(931);
		GLOBAL_LOGININDEX = multipliers.get(1200);
		GLOBAL_LOOPCYCLE = multipliers.get(1201);
		MENUGROUPNODE_SIZE = multipliers.get(1300);
		GLOBAL_MENUHEIGHT = multipliers.get(1301);
		GLOBAL_MENUOPTIONSCOUNT = multipliers.get(1302);
		GLOBAL_MENUOPTIONSCOUNTCOLLAPSED = multipliers.get(1303);
		GLOBAL_MENUWIDTH = multipliers.get(1304);
		GLOBAL_MENUX = multipliers.get(1305);
		GLOBAL_MENUY = multipliers.get(1306);
		GLOBAL_MINIMAPOFFSET = multipliers.get(1307);
		GLOBAL_MINIMAPSCALE = multipliers.get(1308);
		GLOBAL_MINIMAPSETTING = multipliers.get(1309);
		NODE_ID = multipliers.get(1400);
		NODE_ID_p2 = multipliers.get(1401);
		NPC_LEVEL = multipliers.get(1402);
		NPCDEF_ID = multipliers.get(1403);
		GLOBAL_NPCCOUNT = multipliers.get(1404);
		OBJECTDEF_ID = multipliers.get(1500);
		GLOBAL_PLANE = multipliers.get(1600);
		PLAYER_LEVEL = multipliers.get(1601);
		PLAYER_PRAYERICON = multipliers.get(1602);
		PLAYER_SKULLICON = multipliers.get(1603);
		PLAYER_TEAM = multipliers.get(1604);
		PLAYERCOMPOSITE_NPCID = multipliers.get(1605);
		GLOBAL_PLAYERCOUNT = multipliers.get(1606);
		GLOBAL_SELECTEDITEMID = multipliers.get(1900);
		SEQUENCE_ID = multipliers.get(1901);
		//SERVERDATA_WORLDID = multipliers.get(1902);
		SERVERDATA_WORLDID = 1;
		GLOBAL_SUBMENUWIDTH = multipliers.get(1903);
		GLOBAL_SUBMENUX = multipliers.get(1904);
		GLOBAL_SUBMENUY = multipliers.get(1905);
	}
}
