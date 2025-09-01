// Description: Java 11 JavaFX Display Element Factory Interface for Value.

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
 *	ICFBamJavaFXValueFactory JavaFX Display Element Factory Interface
 *	for Value.
 */
public interface ICFBamJavaFXValueFactory
{
	public CFGridPane newAttrPane( ICFFormManager formManager, ICFBamValueObj javaFXFocus );

	public CFBorderPane newListPane( ICFFormManager formManager,
		ICFBamScopeObj argContainer,
		ICFBamValueObj argFocus,
		Collection<ICFBamValueObj> argDataCollection,
		ICFRefreshCallback refreshCallback,
		boolean sortByChain );

	public CFBorderPane newPickerPane( ICFFormManager formManager,
		ICFBamValueObj argFocus,
		ICFBamScopeObj argContainer,
		Collection<ICFBamValueObj> argDataCollection,
		ICFBamJavaFXValueChosen whenChosen );

	public CFTabPane newEltTabPane( ICFFormManager formManger, ICFBamValueObj javaFXFocus );

	public CFBorderPane newAskDeleteForm( ICFFormManager formManager, ICFBamValueObj javaFXFocus, ICFDeleteCallback callback );

	public CFSplitPane newAddPane( ICFFormManager formManger, ICFBamValueObj javaFXFocus );

	public CFSplitPane newViewEditPane( ICFFormManager formManger, ICFBamValueObj javaFXFocus );

	public CFBorderPane newPickerForm( ICFFormManager formManager,
		ICFBamValueObj javaFXFocus,
		ICFBamScopeObj argContainer,
		Collection<ICFBamValueObj> argDataCollection,
		ICFBamJavaFXValueChosen whenChosen );

	public CFBorderPane newAddForm( ICFFormManager formManager, ICFBamValueObj javaFXFocus, ICFFormClosedCallback closeCallback, boolean allowSave );

	public CFBorderPane newViewEditForm( ICFFormManager formManager, ICFBamValueObj javaFXFocus, ICFFormClosedCallback closeCallback, boolean cameFromAdd );
}
