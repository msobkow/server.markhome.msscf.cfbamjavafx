// Description: Java 11 JavaFX Display Element Factory Interface for PopSubDep2.

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
 *	ICFBamJavaFXPopSubDep2Factory JavaFX Display Element Factory Interface
 *	for PopSubDep2.
 */
public interface ICFBamJavaFXPopSubDep2Factory
{
	public CFGridPane newAttrPane( ICFFormManager formManager, ICFBamPopSubDep2Obj javaFXFocus );

	public CFBorderPane newListPane( ICFFormManager formManager,
		ICFBamPopSubDep1Obj argContainer,
		ICFBamPopSubDep2Obj argFocus,
		Collection<ICFBamPopSubDep2Obj> argDataCollection,
		ICFRefreshCallback refreshCallback,
		boolean sortByChain );

	public CFBorderPane newPickerPane( ICFFormManager formManager,
		ICFBamPopSubDep2Obj argFocus,
		ICFBamPopSubDep1Obj argContainer,
		Collection<ICFBamPopSubDep2Obj> argDataCollection,
		ICFBamJavaFXPopSubDep2Chosen whenChosen );

	public CFTabPane newEltTabPane( ICFFormManager formManger, ICFBamPopSubDep2Obj javaFXFocus );

	public CFBorderPane newAskDeleteForm( ICFFormManager formManager, ICFBamPopSubDep2Obj javaFXFocus, ICFDeleteCallback callback );

	public CFSplitPane newAddPane( ICFFormManager formManger, ICFBamPopSubDep2Obj javaFXFocus );

	public CFSplitPane newViewEditPane( ICFFormManager formManger, ICFBamPopSubDep2Obj javaFXFocus );

	public CFBorderPane newPickerForm( ICFFormManager formManager,
		ICFBamPopSubDep2Obj javaFXFocus,
		ICFBamPopSubDep1Obj argContainer,
		Collection<ICFBamPopSubDep2Obj> argDataCollection,
		ICFBamJavaFXPopSubDep2Chosen whenChosen );

	public CFBorderPane newAddForm( ICFFormManager formManager, ICFBamPopSubDep2Obj javaFXFocus, ICFFormClosedCallback closeCallback, boolean allowSave );

	public CFBorderPane newViewEditForm( ICFFormManager formManager, ICFBamPopSubDep2Obj javaFXFocus, ICFFormClosedCallback closeCallback, boolean cameFromAdd );
}
