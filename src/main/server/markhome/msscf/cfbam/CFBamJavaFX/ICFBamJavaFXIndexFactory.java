// Description: Java 11 JavaFX Display Element Factory Interface for Index.

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
 *	ICFBamJavaFXIndexFactory JavaFX Display Element Factory Interface
 *	for Index.
 */
public interface ICFBamJavaFXIndexFactory
{
	public CFGridPane newAttrPane( ICFFormManager formManager, ICFBamIndexObj javaFXFocus );

	public CFBorderPane newListPane( ICFFormManager formManager,
		ICFBamTableObj argContainer,
		ICFBamIndexObj argFocus,
		Collection<ICFBamIndexObj> argDataCollection,
		ICFRefreshCallback refreshCallback,
		boolean sortByChain );

	public CFBorderPane newPickerPane( ICFFormManager formManager,
		ICFBamIndexObj argFocus,
		ICFBamTableObj argContainer,
		Collection<ICFBamIndexObj> argDataCollection,
		ICFBamJavaFXIndexChosen whenChosen );

	public CFTabPane newEltTabPane( ICFFormManager formManger, ICFBamIndexObj javaFXFocus );

	public CFBorderPane newAskDeleteForm( ICFFormManager formManager, ICFBamIndexObj javaFXFocus, ICFDeleteCallback callback );

	public CFSplitPane newAddPane( ICFFormManager formManger, ICFBamIndexObj javaFXFocus );

	public CFSplitPane newViewEditPane( ICFFormManager formManger, ICFBamIndexObj javaFXFocus );

	public CFBorderPane newPickerForm( ICFFormManager formManager,
		ICFBamIndexObj javaFXFocus,
		ICFBamTableObj argContainer,
		Collection<ICFBamIndexObj> argDataCollection,
		ICFBamJavaFXIndexChosen whenChosen );

	public CFBorderPane newAddForm( ICFFormManager formManager, ICFBamIndexObj javaFXFocus, ICFFormClosedCallback closeCallback, boolean allowSave );

	public CFBorderPane newViewEditForm( ICFFormManager formManager, ICFBamIndexObj javaFXFocus, ICFFormClosedCallback closeCallback, boolean cameFromAdd );
}
