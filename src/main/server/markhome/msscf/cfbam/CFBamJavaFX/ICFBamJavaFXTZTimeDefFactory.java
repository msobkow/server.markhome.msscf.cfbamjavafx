// Description: Java 11 JavaFX Display Element Factory Interface for TZTimeDef.

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
 *	ICFBamJavaFXTZTimeDefFactory JavaFX Display Element Factory Interface
 *	for TZTimeDef.
 */
public interface ICFBamJavaFXTZTimeDefFactory
{
	public CFGridPane newAttrPane( ICFFormManager formManager, ICFBamTZTimeDefObj javaFXFocus );

	public CFBorderPane newListPane( ICFFormManager formManager,
		ICFBamScopeObj argContainer,
		ICFBamTZTimeDefObj argFocus,
		Collection<ICFBamTZTimeDefObj> argDataCollection,
		ICFRefreshCallback refreshCallback,
		boolean sortByChain );

	public CFBorderPane newPickerPane( ICFFormManager formManager,
		ICFBamTZTimeDefObj argFocus,
		ICFBamScopeObj argContainer,
		Collection<ICFBamTZTimeDefObj> argDataCollection,
		ICFBamJavaFXTZTimeDefChosen whenChosen );

	public CFTabPane newEltTabPane( ICFFormManager formManger, ICFBamTZTimeDefObj javaFXFocus );

	public CFBorderPane newAskDeleteForm( ICFFormManager formManager, ICFBamTZTimeDefObj javaFXFocus, ICFDeleteCallback callback );

	public CFSplitPane newAddPane( ICFFormManager formManger, ICFBamTZTimeDefObj javaFXFocus );

	public CFSplitPane newViewEditPane( ICFFormManager formManger, ICFBamTZTimeDefObj javaFXFocus );

	public CFBorderPane newPickerForm( ICFFormManager formManager,
		ICFBamTZTimeDefObj javaFXFocus,
		ICFBamScopeObj argContainer,
		Collection<ICFBamTZTimeDefObj> argDataCollection,
		ICFBamJavaFXTZTimeDefChosen whenChosen );

	public CFBorderPane newAddForm( ICFFormManager formManager, ICFBamTZTimeDefObj javaFXFocus, ICFFormClosedCallback closeCallback, boolean allowSave );

	public CFBorderPane newViewEditForm( ICFFormManager formManager, ICFBamTZTimeDefObj javaFXFocus, ICFFormClosedCallback closeCallback, boolean cameFromAdd );
}
