// Description: Java 11 JavaFX Display Element Factory for UInt16Type.

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
 *	CFBamJavaFXUInt16TypeFactory JavaFX Display Element Factory
 *	for UInt16Type.
 */
public class CFBamJavaFXUInt16TypeFactory
implements ICFBamJavaFXUInt16TypeFactory
{
	protected ICFBamJavaFXSchema javafxSchema = null;

	public CFBamJavaFXUInt16TypeFactory( ICFBamJavaFXSchema argSchema ) {
		final String S_ProcName = "construct-schema";
		if( argSchema == null ) {
			throw new CFLibNullArgumentException( this.getClass(),
				S_ProcName,
				1,
				"argSchema" );
		}
		javafxSchema = argSchema;
	}

	public CFGridPane newAttrPane( ICFFormManager formManager, ICFBamUInt16TypeObj argFocus ) {
		CFBamJavaFXUInt16TypeAttrPane retnew = new CFBamJavaFXUInt16TypeAttrPane( formManager, javafxSchema, argFocus );
		return( retnew );
	}

	public CFBorderPane newListPane( ICFFormManager formManager,
		ICFBamSchemaDefObj argContainer,
		ICFBamUInt16TypeObj argFocus,
		Collection<ICFBamUInt16TypeObj> argDataCollection,
		ICFRefreshCallback refreshCallback,
		boolean sortByChain )
	{
		CFBamJavaFXUInt16TypeListPane retnew = new CFBamJavaFXUInt16TypeListPane( formManager,
			javafxSchema,
			argContainer,
			argFocus,
			argDataCollection,
			refreshCallback,
			sortByChain );
		return( retnew );
	}

	public CFBorderPane newPickerPane( ICFFormManager formManager,
		ICFBamUInt16TypeObj argFocus,
		ICFBamSchemaDefObj argContainer,
		Collection<ICFBamUInt16TypeObj> argDataCollection,
		ICFBamJavaFXUInt16TypeChosen whenChosen )
	{
		CFBamJavaFXUInt16TypePickerPane retnew = new CFBamJavaFXUInt16TypePickerPane( formManager,
			javafxSchema,
			argFocus,
			argContainer,
			argDataCollection,
			whenChosen );
		return( retnew );
	}

	public CFTabPane newEltTabPane( ICFFormManager formManager, ICFBamUInt16TypeObj argFocus ) {
		CFBamJavaFXUInt16TypeEltTabPane retnew = new CFBamJavaFXUInt16TypeEltTabPane( formManager, javafxSchema, argFocus );
		return( retnew );
	}

	public CFSplitPane newAddPane( ICFFormManager formManager, ICFBamUInt16TypeObj argFocus ) {
		CFBamJavaFXUInt16TypeAddPane retnew = new CFBamJavaFXUInt16TypeAddPane( formManager, javafxSchema, argFocus );
		return( retnew );
	}

	public CFSplitPane newViewEditPane( ICFFormManager formManager, ICFBamUInt16TypeObj argFocus ) {
		CFBamJavaFXUInt16TypeViewEditPane retnew = new CFBamJavaFXUInt16TypeViewEditPane( formManager, javafxSchema, argFocus );
		return( retnew );
	}

	public CFBorderPane newAskDeleteForm( ICFFormManager formManager, ICFBamUInt16TypeObj argFocus, ICFDeleteCallback callback ) {
		CFBamJavaFXUInt16TypeAskDeleteForm retnew = new CFBamJavaFXUInt16TypeAskDeleteForm( formManager, javafxSchema, argFocus, callback );
		return( retnew );
	}

	public CFBorderPane newPickerForm( ICFFormManager formManager,
		ICFBamUInt16TypeObj argFocus,
		ICFBamSchemaDefObj argContainer,
		Collection<ICFBamUInt16TypeObj> argDataCollection,
		ICFBamJavaFXUInt16TypeChosen whenChosen )
	{
		CFBamJavaFXUInt16TypePickerForm retnew = new CFBamJavaFXUInt16TypePickerForm( formManager,
			javafxSchema,
			argFocus,
			argContainer,
			argDataCollection,
			whenChosen );
		return( retnew );
	}

	public CFBorderPane newAddForm( ICFFormManager formManager, ICFBamUInt16TypeObj argFocus, ICFFormClosedCallback closeCallback, boolean allowSave ) {
		CFBamJavaFXUInt16TypeAddForm retnew = new CFBamJavaFXUInt16TypeAddForm( formManager, javafxSchema, argFocus, closeCallback, allowSave );
		return( retnew );
	}

	public CFBorderPane newViewEditForm( ICFFormManager formManager, ICFBamUInt16TypeObj argFocus, ICFFormClosedCallback closeCallback, boolean cameFromAdd ) {
		CFBamJavaFXUInt16TypeViewEditForm retnew = new CFBamJavaFXUInt16TypeViewEditForm( formManager, javafxSchema, argFocus, closeCallback, cameFromAdd );
		return( retnew );
	}
}
