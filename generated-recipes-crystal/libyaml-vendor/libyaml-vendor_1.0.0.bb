# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Wrapper around libyaml, provides the last version (1.8.0 rc) that ships with a CMake module"
AUTHOR = "Mikael Arguedas <mikael@osrfoundation.org>"
HOMEPAGE = "https://github.com/yaml/libyaml"
SECTION = "devel"
LICENSE = "Apache-2.0 & MIT"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=f12ef8c0445c08084ae92cf2dcb7ee92"

ROS_BUILD_DEPENDS = ""

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-native \
"

ROS_EXPORT_DEPENDS = ""

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = ""

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/ros2-gbp/libyaml_vendor-release/archive/release/crystal/libyaml_vendor/1.0.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "c70cb2bfde7747051c052bb3c839d6e6"
SRC_URI[sha256sum] = "54515207095b2974e152995adc92a9d0bf88b885336bbefcc26ca404af305188"
S = "${WORKDIR}/libyaml_vendor-release-release-crystal-libyaml_vendor-1.0.0-0"

ROS_BUILD_TYPE = "ament_cmake"
ROS_RECIPES_TREE = "recipes-ros2"

# Allow the above settings to be overridden.
include ${ROS_LAYERDIR}/recipes-ros/libyaml-vendor/libyaml-vendor_common.inc
include ${ROS_LAYERDIR}/recipes-ros2/libyaml-vendor/libyaml-vendor_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/libyaml-vendor/libyaml-vendor-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/libyaml-vendor/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/libyaml-vendor/${BPN}-${PV}.inc

inherit ros_superflore_generated
inherit ros_${ROS_DISTRO}
inherit ros_${ROS_BUILD_TYPE}
