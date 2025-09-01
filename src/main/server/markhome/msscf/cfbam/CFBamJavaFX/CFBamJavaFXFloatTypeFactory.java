// Description: Java 11 JavaFX Display Element Factory for FloatType.

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
 *	CFBamJavaFXFloatTypeFactory JavaFX Display Element Factory
 *	for FloatType.
 */
public class CFBamJavaFXFloatTypeFactory
implements ICFBamJavaFXFloatTypeFactory
{
	protected ICFBamJavaFXSchema javafxSchema = null;

	public CFBamJavaFXFloatTypeFactory( ICFBamJavaFXSchema argSchema ) {
		final String S_ProcName = "construct-schema";
		if( argSchema == null ) {
			throw new CFLibNullArgumentException( this.getClass(),
				S_ProcName,
				1,
				"argSchema" );
		}
		javafxSchema = argSchema;
	}

	public CFGridPane newAttrPane( ICFFormManager formManager, ICFBamFloatTypeObj argFocus ) {
		CFBamJavaFXFloatTypeAttrPane retnew = new CFBamJavaFXFloatTypeAttrPane( formManager, javafxSchema, argFocus );
		return( retnew );
	}

	public CFBorderPane newListPane( ICFFormManager formManager,
		ICFBamSchemaDefObj argContainer,
		ICFBamFloatTypeObj argFocus,
		Collection<ICFBamFloatTypeObj> argDataCollection,
		ICFRefreshCallback refreshCallback,
		boolean sortByChain )
	{
		CFBamJavaFXFloatTypeListPane retnew = new CFBamJavaFXFloatTypeListPane( formManager,
			javafxSchema,
			argContainer,
			argFocus,
			argDataCollection,
			refreshCallback,
			sortByChain );
		return( retnew );
	}

	public CFBorderPane newPickerPane( ICFFormManager formManager,
		ICFBamFloatTypeObj argFocus,
		ICFBamSchemaDefObj argContainer,
		Collection<ICFBamFloatTypeObj> argDataCollection,
		ICFBamJavaFXFloatTypeChosen whenChosen )
	{
		CFBamJavaFXFloatTypePickerPane retnew = new CFBamJavaFXFloatTypePickerPane( formManager,
			javafxSchema,
			argFocus,
			argContainer,
			argDataCollection,
			whenChosen );
		return( retnew );
	}

	public CFTabPane newEltTabPane( ICFFormManager formManager, ICFBamFloatTypeObj argFocus ) {
		CFBamJavaFXFloatTypeEltTabPane retnew = new CFBamJavaFXFloatTypeEltTabPane( formManager, javafxSchema, argFocus );
		return( retnew );
	}

	public CFSplitPane newAddPane( ICFFormManager formManager, ICFBamFloatTypeObj argFocus ) {
		CFBamJavaFXFloatTypeAddPane retnew = new CFBamJavaFXFloatTypeAddPane( formManager, javafxSchema, argFocus );
		return( retnew );
	}

	public CFSplitPane newViewEditPane( ICFFormManager formManager, ICFBamFloatTypeObj argFocus ) {
		CFBamJavaFXFloatTypeViewEditPane retnew = new CFBamJavaFXFloatTypeViewEditPane( formManager, javafxSchema, argFocus );
		return( retnew );
	}

	public CFBorderPane newAskDeleteForm( ICFFormManager formManager, ICFBamFloatTypeObj argFocus, ICFDeleteCallback callback ) {
		CFBamJavaFXFloatTypeAskDeleteForm retnew = new CFBamJavaFXFloatTypeAskDeleteForm( formManager, javafxSchema, argFocus, callback );
		return( retnew );
	}

	public CFBorderPane newPickerForm( ICFFormManager formManager,
		ICFBamFloatTypeObj argFocus,
		ICFBamSchemaDefObj argContainer,
		Collection<ICFBamFloatTypeObj> argDataCollection,
		ICFBamJavaFXFloatTypeChosen whenChosen )
	{
		CFBamJavaFXFloatTypePickerForm retnew = new CFBamJavaFXFloatTypePickerForm( formManager,
			javafxSchema,
			argFocus,
			argContainer,
			argDataCollection,
			whenChosen );
		return( retnew );
	}

	public CFBorderPane newAddForm( ICFFormManager formManager, ICFBamFloatTypeObj argFocus, ICFFormClosedCallback closeCallback, boolean allowSave ) {
		CFBamJavaFXFloatTypeAddForm retnew = new CFBamJavaFXFloatTypeAddForm( formManager, javafxSchema, argFocus, closeCallback, allowSave );
		return( retnew );
	}

	public CFBorderPane newViewEditForm( ICFFormManager formManager, ICFBamFloatTypeObj argFocus, ICFFormClosedCallback closeCallback, boolean cameFromAdd ) {
		CFBamJavaFXFloatTypeViewEditForm retnew = new CFBamJavaFXFloatTypeViewEditForm( formManager, javafxSchema, argFocus, closeCallback, cameFromAdd );
		return( retnew );
	}
}
