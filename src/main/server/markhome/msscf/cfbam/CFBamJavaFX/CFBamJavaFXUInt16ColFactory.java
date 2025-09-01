// Description: Java 11 JavaFX Display Element Factory for UInt16Col.

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
 *	CFBamJavaFXUInt16ColFactory JavaFX Display Element Factory
 *	for UInt16Col.
 */
public class CFBamJavaFXUInt16ColFactory
implements ICFBamJavaFXUInt16ColFactory
{
	protected ICFBamJavaFXSchema javafxSchema = null;

	public CFBamJavaFXUInt16ColFactory( ICFBamJavaFXSchema argSchema ) {
		final String S_ProcName = "construct-schema";
		if( argSchema == null ) {
			throw new CFLibNullArgumentException( this.getClass(),
				S_ProcName,
				1,
				"argSchema" );
		}
		javafxSchema = argSchema;
	}

	public CFGridPane newAttrPane( ICFFormManager formManager, ICFBamUInt16ColObj argFocus ) {
		CFBamJavaFXUInt16ColAttrPane retnew = new CFBamJavaFXUInt16ColAttrPane( formManager, javafxSchema, argFocus );
		return( retnew );
	}

	public CFBorderPane newListPane( ICFFormManager formManager,
		ICFBamTableObj argContainer,
		ICFBamUInt16ColObj argFocus,
		Collection<ICFBamUInt16ColObj> argDataCollection,
		ICFRefreshCallback refreshCallback,
		boolean sortByChain )
	{
		CFBamJavaFXUInt16ColListPane retnew = new CFBamJavaFXUInt16ColListPane( formManager,
			javafxSchema,
			argContainer,
			argFocus,
			argDataCollection,
			refreshCallback,
			sortByChain );
		return( retnew );
	}

	public CFBorderPane newPickerPane( ICFFormManager formManager,
		ICFBamUInt16ColObj argFocus,
		ICFBamTableObj argContainer,
		Collection<ICFBamUInt16ColObj> argDataCollection,
		ICFBamJavaFXUInt16ColChosen whenChosen )
	{
		CFBamJavaFXUInt16ColPickerPane retnew = new CFBamJavaFXUInt16ColPickerPane( formManager,
			javafxSchema,
			argFocus,
			argContainer,
			argDataCollection,
			whenChosen );
		return( retnew );
	}

	public CFTabPane newEltTabPane( ICFFormManager formManager, ICFBamUInt16ColObj argFocus ) {
		CFBamJavaFXUInt16ColEltTabPane retnew = new CFBamJavaFXUInt16ColEltTabPane( formManager, javafxSchema, argFocus );
		return( retnew );
	}

	public CFSplitPane newAddPane( ICFFormManager formManager, ICFBamUInt16ColObj argFocus ) {
		CFBamJavaFXUInt16ColAddPane retnew = new CFBamJavaFXUInt16ColAddPane( formManager, javafxSchema, argFocus );
		return( retnew );
	}

	public CFSplitPane newViewEditPane( ICFFormManager formManager, ICFBamUInt16ColObj argFocus ) {
		CFBamJavaFXUInt16ColViewEditPane retnew = new CFBamJavaFXUInt16ColViewEditPane( formManager, javafxSchema, argFocus );
		return( retnew );
	}

	public CFBorderPane newAskDeleteForm( ICFFormManager formManager, ICFBamUInt16ColObj argFocus, ICFDeleteCallback callback ) {
		CFBamJavaFXUInt16ColAskDeleteForm retnew = new CFBamJavaFXUInt16ColAskDeleteForm( formManager, javafxSchema, argFocus, callback );
		return( retnew );
	}

	public CFBorderPane newPickerForm( ICFFormManager formManager,
		ICFBamUInt16ColObj argFocus,
		ICFBamTableObj argContainer,
		Collection<ICFBamUInt16ColObj> argDataCollection,
		ICFBamJavaFXUInt16ColChosen whenChosen )
	{
		CFBamJavaFXUInt16ColPickerForm retnew = new CFBamJavaFXUInt16ColPickerForm( formManager,
			javafxSchema,
			argFocus,
			argContainer,
			argDataCollection,
			whenChosen );
		return( retnew );
	}

	public CFBorderPane newAddForm( ICFFormManager formManager, ICFBamUInt16ColObj argFocus, ICFFormClosedCallback closeCallback, boolean allowSave ) {
		CFBamJavaFXUInt16ColAddForm retnew = new CFBamJavaFXUInt16ColAddForm( formManager, javafxSchema, argFocus, closeCallback, allowSave );
		return( retnew );
	}

	public CFBorderPane newViewEditForm( ICFFormManager formManager, ICFBamUInt16ColObj argFocus, ICFFormClosedCallback closeCallback, boolean cameFromAdd ) {
		CFBamJavaFXUInt16ColViewEditForm retnew = new CFBamJavaFXUInt16ColViewEditForm( formManager, javafxSchema, argFocus, closeCallback, cameFromAdd );
		return( retnew );
	}
}
