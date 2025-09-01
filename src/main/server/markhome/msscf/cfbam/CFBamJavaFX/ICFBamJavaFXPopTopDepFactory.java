// Description: Java 11 JavaFX Display Element Factory Interface for PopTopDep.

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
 *	ICFBamJavaFXPopTopDepFactory JavaFX Display Element Factory Interface
 *	for PopTopDep.
 */
public interface ICFBamJavaFXPopTopDepFactory
{
	public CFGridPane newAttrPane( ICFFormManager formManager, ICFBamPopTopDepObj javaFXFocus );

	public CFBorderPane newListPane( ICFFormManager formManager,
		ICFBamRelationObj argContainer,
		ICFBamPopTopDepObj argFocus,
		Collection<ICFBamPopTopDepObj> argDataCollection,
		ICFRefreshCallback refreshCallback,
		boolean sortByChain );

	public CFBorderPane newPickerPane( ICFFormManager formManager,
		ICFBamPopTopDepObj argFocus,
		ICFBamRelationObj argContainer,
		Collection<ICFBamPopTopDepObj> argDataCollection,
		ICFBamJavaFXPopTopDepChosen whenChosen );

	public CFTabPane newEltTabPane( ICFFormManager formManger, ICFBamPopTopDepObj javaFXFocus );

	public CFBorderPane newAskDeleteForm( ICFFormManager formManager, ICFBamPopTopDepObj javaFXFocus, ICFDeleteCallback callback );

	public CFSplitPane newAddPane( ICFFormManager formManger, ICFBamPopTopDepObj javaFXFocus );

	public CFSplitPane newViewEditPane( ICFFormManager formManger, ICFBamPopTopDepObj javaFXFocus );

	public CFBorderPane newPickerForm( ICFFormManager formManager,
		ICFBamPopTopDepObj javaFXFocus,
		ICFBamRelationObj argContainer,
		Collection<ICFBamPopTopDepObj> argDataCollection,
		ICFBamJavaFXPopTopDepChosen whenChosen );

	public CFBorderPane newAddForm( ICFFormManager formManager, ICFBamPopTopDepObj javaFXFocus, ICFFormClosedCallback closeCallback, boolean allowSave );

	public CFBorderPane newViewEditForm( ICFFormManager formManager, ICFBamPopTopDepObj javaFXFocus, ICFFormClosedCallback closeCallback, boolean cameFromAdd );
}
