// Description: Java 11 JavaFX Display Element Factory Interface for FloatCol.

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
 *	ICFBamJavaFXFloatColFactory JavaFX Display Element Factory Interface
 *	for FloatCol.
 */
public interface ICFBamJavaFXFloatColFactory
{
	public CFGridPane newAttrPane( ICFFormManager formManager, ICFBamFloatColObj javaFXFocus );

	public CFBorderPane newListPane( ICFFormManager formManager,
		ICFBamTableObj argContainer,
		ICFBamFloatColObj argFocus,
		Collection<ICFBamFloatColObj> argDataCollection,
		ICFRefreshCallback refreshCallback,
		boolean sortByChain );

	public CFBorderPane newPickerPane( ICFFormManager formManager,
		ICFBamFloatColObj argFocus,
		ICFBamTableObj argContainer,
		Collection<ICFBamFloatColObj> argDataCollection,
		ICFBamJavaFXFloatColChosen whenChosen );

	public CFTabPane newEltTabPane( ICFFormManager formManger, ICFBamFloatColObj javaFXFocus );

	public CFBorderPane newAskDeleteForm( ICFFormManager formManager, ICFBamFloatColObj javaFXFocus, ICFDeleteCallback callback );

	public CFSplitPane newAddPane( ICFFormManager formManger, ICFBamFloatColObj javaFXFocus );

	public CFSplitPane newViewEditPane( ICFFormManager formManger, ICFBamFloatColObj javaFXFocus );

	public CFBorderPane newPickerForm( ICFFormManager formManager,
		ICFBamFloatColObj javaFXFocus,
		ICFBamTableObj argContainer,
		Collection<ICFBamFloatColObj> argDataCollection,
		ICFBamJavaFXFloatColChosen whenChosen );

	public CFBorderPane newAddForm( ICFFormManager formManager, ICFBamFloatColObj javaFXFocus, ICFFormClosedCallback closeCallback, boolean allowSave );

	public CFBorderPane newViewEditForm( ICFFormManager formManager, ICFBamFloatColObj javaFXFocus, ICFFormClosedCallback closeCallback, boolean cameFromAdd );
}
