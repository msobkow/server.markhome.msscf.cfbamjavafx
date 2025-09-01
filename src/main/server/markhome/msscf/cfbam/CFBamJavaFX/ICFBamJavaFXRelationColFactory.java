// Description: Java 11 JavaFX Display Element Factory Interface for RelationCol.

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
 *	ICFBamJavaFXRelationColFactory JavaFX Display Element Factory Interface
 *	for RelationCol.
 */
public interface ICFBamJavaFXRelationColFactory
{
	public CFGridPane newAttrPane( ICFFormManager formManager, ICFBamRelationColObj javaFXFocus );

	public CFBorderPane newListPane( ICFFormManager formManager,
		ICFBamRelationObj argContainer,
		ICFBamRelationColObj argFocus,
		Collection<ICFBamRelationColObj> argDataCollection,
		ICFRefreshCallback refreshCallback,
		boolean sortByChain );

	public CFBorderPane newPickerPane( ICFFormManager formManager,
		ICFBamRelationColObj argFocus,
		ICFBamRelationObj argContainer,
		Collection<ICFBamRelationColObj> argDataCollection,
		ICFBamJavaFXRelationColChosen whenChosen );

	public CFTabPane newEltTabPane( ICFFormManager formManger, ICFBamRelationColObj javaFXFocus );

	public CFBorderPane newAskDeleteForm( ICFFormManager formManager, ICFBamRelationColObj javaFXFocus, ICFDeleteCallback callback );

	public CFSplitPane newAddPane( ICFFormManager formManger, ICFBamRelationColObj javaFXFocus );

	public CFSplitPane newViewEditPane( ICFFormManager formManger, ICFBamRelationColObj javaFXFocus );

	public CFBorderPane newPickerForm( ICFFormManager formManager,
		ICFBamRelationColObj javaFXFocus,
		ICFBamRelationObj argContainer,
		Collection<ICFBamRelationColObj> argDataCollection,
		ICFBamJavaFXRelationColChosen whenChosen );

	public CFBorderPane newAddForm( ICFFormManager formManager, ICFBamRelationColObj javaFXFocus, ICFFormClosedCallback closeCallback, boolean allowSave );

	public CFBorderPane newViewEditForm( ICFFormManager formManager, ICFBamRelationColObj javaFXFocus, ICFFormClosedCallback closeCallback, boolean cameFromAdd );
}
