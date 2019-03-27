# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Wrapper around console_bridge, providing nothing but a dependency on console_bridge, on some systems.     On others, it provides an ExternalProject build of console_bridge."
AUTHOR = "Steven! Ragnarök <steven@osrfoundation.org>"
HOMEPAGE = "https://github.com/ros/console_bridge"
SECTION = "devel"
LICENSE = "Apache-2.0 & BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=13;endline=13;md5=f12ef8c0445c08084ae92cf2dcb7ee92"

ROS_BUILD_DEPENDS = " \
    console-bridge \
"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-native \
"

ROS_EXPORT_DEPENDS = " \
    console-bridge \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    console-bridge \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/ros2-gbp/console_bridge_vendor-release/archive/release/crystal/console_bridge_vendor/1.1.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "e8a07b8b2393405abf51ed7e4be41090"
SRC_URI[sha256sum] = "1a8eb7126fa9825f35ad4f5373646c2df8b68595d0d6e4c2a595c3916e8f7722"
S = "${WORKDIR}/console_bridge_vendor-release-release-crystal-console_bridge_vendor-1.1.0-0"

ROS_BUILD_TYPE = "ament_cmake"
ROS_RECIPES_TREE = "recipes-ros2"

# Allow the above settings to be overridden.
include ${ROS_LAYERDIR}/recipes-ros/console-bridge-vendor/console-bridge-vendor_common.inc
include ${ROS_LAYERDIR}/recipes-ros2/console-bridge-vendor/console-bridge-vendor_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/console-bridge-vendor/console-bridge-vendor-${PV}_common.inc

inherit ros_${ROS_DISTRO}
inherit ros_${ROS_BUILD_TYPE}

