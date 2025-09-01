// Description: Java 11 JavaFX Display Element Factory Interface for ClearSubDep1.

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
 *	ICFBamJavaFXClearSubDep1Factory JavaFX Display Element Factory Interface
 *	for ClearSubDep1.
 */
public interface ICFBamJavaFXClearSubDep1Factory
{
	public CFGridPane newAttrPane( ICFFormManager formManager, ICFBamClearSubDep1Obj javaFXFocus );

	public CFBorderPane newListPane( ICFFormManager formManager,
		ICFBamClearTopDepObj argContainer,
		ICFBamClearSubDep1Obj argFocus,
		Collection<ICFBamClearSubDep1Obj> argDataCollection,
		ICFRefreshCallback refreshCallback,
		boolean sortByChain );

	public CFBorderPane newPickerPane( ICFFormManager formManager,
		ICFBamClearSubDep1Obj argFocus,
		ICFBamClearTopDepObj argContainer,
		Collection<ICFBamClearSubDep1Obj> argDataCollection,
		ICFBamJavaFXClearSubDep1Chosen whenChosen );

	public CFTabPane newEltTabPane( ICFFormManager formManger, ICFBamClearSubDep1Obj javaFXFocus );

	public CFBorderPane newAskDeleteForm( ICFFormManager formManager, ICFBamClearSubDep1Obj javaFXFocus, ICFDeleteCallback callback );

	public CFSplitPane newAddPane( ICFFormManager formManger, ICFBamClearSubDep1Obj javaFXFocus );

	public CFSplitPane newViewEditPane( ICFFormManager formManger, ICFBamClearSubDep1Obj javaFXFocus );

	public CFBorderPane newPickerForm( ICFFormManager formManager,
		ICFBamClearSubDep1Obj javaFXFocus,
		ICFBamClearTopDepObj argContainer,
		Collection<ICFBamClearSubDep1Obj> argDataCollection,
		ICFBamJavaFXClearSubDep1Chosen whenChosen );

	public CFBorderPane newAddForm( ICFFormManager formManager, ICFBamClearSubDep1Obj javaFXFocus, ICFFormClosedCallback closeCallback, boolean allowSave );

	public CFBorderPane newViewEditForm( ICFFormManager formManager, ICFBamClearSubDep1Obj javaFXFocus, ICFFormClosedCallback closeCallback, boolean cameFromAdd );
}
