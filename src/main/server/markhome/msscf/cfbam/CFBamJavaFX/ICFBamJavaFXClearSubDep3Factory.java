// Description: Java 11 JavaFX Display Element Factory Interface for ClearSubDep3.

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
 *	ICFBamJavaFXClearSubDep3Factory JavaFX Display Element Factory Interface
 *	for ClearSubDep3.
 */
public interface ICFBamJavaFXClearSubDep3Factory
{
	public CFGridPane newAttrPane( ICFFormManager formManager, ICFBamClearSubDep3Obj javaFXFocus );

	public CFBorderPane newListPane( ICFFormManager formManager,
		ICFBamClearSubDep2Obj argContainer,
		ICFBamClearSubDep3Obj argFocus,
		Collection<ICFBamClearSubDep3Obj> argDataCollection,
		ICFRefreshCallback refreshCallback,
		boolean sortByChain );

	public CFBorderPane newPickerPane( ICFFormManager formManager,
		ICFBamClearSubDep3Obj argFocus,
		ICFBamClearSubDep2Obj argContainer,
		Collection<ICFBamClearSubDep3Obj> argDataCollection,
		ICFBamJavaFXClearSubDep3Chosen whenChosen );

	public CFTabPane newEltTabPane( ICFFormManager formManger, ICFBamClearSubDep3Obj javaFXFocus );

	public CFBorderPane newAskDeleteForm( ICFFormManager formManager, ICFBamClearSubDep3Obj javaFXFocus, ICFDeleteCallback callback );

	public CFSplitPane newAddPane( ICFFormManager formManger, ICFBamClearSubDep3Obj javaFXFocus );

	public CFSplitPane newViewEditPane( ICFFormManager formManger, ICFBamClearSubDep3Obj javaFXFocus );

	public CFBorderPane newPickerForm( ICFFormManager formManager,
		ICFBamClearSubDep3Obj javaFXFocus,
		ICFBamClearSubDep2Obj argContainer,
		Collection<ICFBamClearSubDep3Obj> argDataCollection,
		ICFBamJavaFXClearSubDep3Chosen whenChosen );

	public CFBorderPane newAddForm( ICFFormManager formManager, ICFBamClearSubDep3Obj javaFXFocus, ICFFormClosedCallback closeCallback, boolean allowSave );

	public CFBorderPane newViewEditForm( ICFFormManager formManager, ICFBamClearSubDep3Obj javaFXFocus, ICFFormClosedCallback closeCallback, boolean cameFromAdd );
}
