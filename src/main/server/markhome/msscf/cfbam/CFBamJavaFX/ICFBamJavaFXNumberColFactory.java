// Description: Java 11 JavaFX Display Element Factory Interface for NumberCol.

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
 *	ICFBamJavaFXNumberColFactory JavaFX Display Element Factory Interface
 *	for NumberCol.
 */
public interface ICFBamJavaFXNumberColFactory
{
	public CFGridPane newAttrPane( ICFFormManager formManager, ICFBamNumberColObj javaFXFocus );

	public CFBorderPane newListPane( ICFFormManager formManager,
		ICFBamTableObj argContainer,
		ICFBamNumberColObj argFocus,
		Collection<ICFBamNumberColObj> argDataCollection,
		ICFRefreshCallback refreshCallback,
		boolean sortByChain );

	public CFBorderPane newPickerPane( ICFFormManager formManager,
		ICFBamNumberColObj argFocus,
		ICFBamTableObj argContainer,
		Collection<ICFBamNumberColObj> argDataCollection,
		ICFBamJavaFXNumberColChosen whenChosen );

	public CFTabPane newEltTabPane( ICFFormManager formManger, ICFBamNumberColObj javaFXFocus );

	public CFBorderPane newAskDeleteForm( ICFFormManager formManager, ICFBamNumberColObj javaFXFocus, ICFDeleteCallback callback );

	public CFSplitPane newAddPane( ICFFormManager formManger, ICFBamNumberColObj javaFXFocus );

	public CFSplitPane newViewEditPane( ICFFormManager formManger, ICFBamNumberColObj javaFXFocus );

	public CFBorderPane newPickerForm( ICFFormManager formManager,
		ICFBamNumberColObj javaFXFocus,
		ICFBamTableObj argContainer,
		Collection<ICFBamNumberColObj> argDataCollection,
		ICFBamJavaFXNumberColChosen whenChosen );

	public CFBorderPane newAddForm( ICFFormManager formManager, ICFBamNumberColObj javaFXFocus, ICFFormClosedCallback closeCallback, boolean allowSave );

	public CFBorderPane newViewEditForm( ICFFormManager formManager, ICFBamNumberColObj javaFXFocus, ICFFormClosedCallback closeCallback, boolean cameFromAdd );
}
