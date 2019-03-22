# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Command line tools for managing SROS2 keys"
AUTHOR = "Mikael Arguedas <mikael@osrfoundation.org>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

ROS_BUILD_DEPENDS = " \
    ros2cli \
"
DEPENDS = "${ROS_BUILD_DEPENDS}"

ROS_BUILDTOOL_DEPENDS = ""
DEPENDS += "${ROS_BUILDTOOL_DEPENDS}"

# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
ROS_EXPORT_DEPENDS = " \
    ros2cli \
"
DEPENDS += "${ROS_EXPORT_DEPENDS}"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""
DEPENDS += "${ROS_BUILDTOOL_EXPORT_DEPENDS}"

ROS_EXEC_DEPENDS = " \
    openssl \
    ros2cli \
"
RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    ament-copyright \
    ament-flake8 \
    ament-pep257 \
    python3-pytest \
"

SRC_URI = "https://github.com/ros2-gbp/sros2-release/archive/release/bouncy/sros2/0.5.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "f32494a8d70e72346e5a39d3bfbcd628"
SRC_URI[sha256sum] = "00a363fc039fa14fb0aa6ddce2ee8711eebbf6fb210dbac11b5c7d763911c151"
S = "${WORKDIR}/sros2-release-release-bouncy-sros2-0.5.0-0"

ROS_BUILD_TYPE = "ament_python"
ROS_RECIPES_TREE = "recipes-ros2"

# Allow the above settings to be overridden.
include ${ROS_LAYERDIR}/recipes-ros/sros2/sros2_common.inc
include ${ROS_LAYERDIR}/recipes-ros2/sros2/sros2_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/sros2/sros2-${PV}_common.inc

inherit ros_${ROSDISTRO}
inherit ros_${ROS_BUILD_TYPE}
