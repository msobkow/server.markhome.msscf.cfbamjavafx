// Description: Java 11 JavaFX Display Element Factory Interface for EnumTag.

/*
 *	server.markhome.msscf.CFBam
 *
 *	Copyright (c) 2020-2025 Mark Stephen Sobkow
 *	
 *
 *	Manufactured by MSS Code Factory 2.13
 */

package server.markhome.msscf.cfbam.CFBamJavaFX;

import java.math.*;
import java.sql.*;
import java.text.*;
import java.util.*;
import org.msscf.msscf.cflib.CFLib.*;
import org.msscf.msscf.cflib.CFLib.JavaFX.*;
import org.apache.commons.codec.binary.Base64;
import server.markhome.msscf.cfsec.CFSec.*;
import server.markhome.msscf.cfint.CFInt.*;
import server.markhome.msscf.cfbam.CFBam.*;
import server.markhome.msscf.cfsec.CFSecObj.*;
import server.markhome.msscf.cfint.CFIntObj.*;
import server.markhome.msscf.cfbam.CFBamObj.*;

/**
 *	ICFBamJavaFXEnumTagFactory JavaFX Display Element Factory Interface
 *	for EnumTag.
 */
public interface ICFBamJavaFXEnumTagFactory
{
	public CFGridPane newAttrPane( ICFFormManager formManager, ICFBamEnumTagObj javaFXFocus );

	public CFBorderPane newListPane( ICFFormManager formManager,
		ICFBamEnumDefObj argContainer,
		ICFBamEnumTagObj argFocus,
		Collection<ICFBamEnumTagObj> argDataCollection,
		ICFRefreshCallback refreshCallback,
		boolean sortByChain );

	public CFBorderPane newPickerPane( ICFFormManager formManager,
		ICFBamEnumTagObj argFocus,
		ICFBamEnumDefObj argContainer,
		Collection<ICFBamEnumTagObj> argDataCollection,
		ICFBamJavaFXEnumTagChosen whenChosen );

	public CFTabPane newEltTabPane( ICFFormManager formManger, ICFBamEnumTagObj javaFXFocus );

	public CFBorderPane newAskDeleteForm( ICFFormManager formManager, ICFBamEnumTagObj javaFXFocus, ICFDeleteCallback callback );

	public CFSplitPane newAddPane( ICFFormManager formManger, ICFBamEnumTagObj javaFXFocus );

	public CFSplitPane newViewEditPane( ICFFormManager formManger, ICFBamEnumTagObj javaFXFocus );

	public CFBorderPane newPickerForm( ICFFormManager formManager,
		ICFBamEnumTagObj javaFXFocus,
		ICFBamEnumDefObj argContainer,
		Collection<ICFBamEnumTagObj> argDataCollection,
		ICFBamJavaFXEnumTagChosen whenChosen );

	public CFBorderPane newAddForm( ICFFormManager formManager, ICFBamEnumTagObj javaFXFocus, ICFFormClosedCallback closeCallback, boolean allowSave );

	public CFBorderPane newViewEditForm( ICFFormManager formManager, ICFBamEnumTagObj javaFXFocus, ICFFormClosedCallback closeCallback, boolean cameFromAdd );
}
