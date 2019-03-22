# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The service command for ROS 2 command line tools."
AUTHOR = "William Woodall <william@osrfoundation.org>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

ROS_BUILD_DEPENDS = " \
    rclpy \
    ros2cli \
"
DEPENDS = "${ROS_BUILD_DEPENDS}"

ROS_BUILDTOOL_DEPENDS = " \
"
DEPENDS += "${ROS_BUILDTOOL_DEPENDS}"

# Bitbake doesn't support this concept, so build them when we build this package even though they aren't.
ROS_EXPORT_DEPENDS = " \
    rclpy \
    ros2cli \
"
DEPENDS += "${ROS_EXPORT_DEPENDS}"

RDEPENDS_${PN} += " \
    python-pyyaml \
    rclpy \
    ros2cli \
    ros2srv \
    ros2topic \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    ament-copyright \
    ament-flake8 \
    ament-pep257 \
    python3-pytest \
"

SRC_URI = "https://github.com/ros2-gbp/ros2cli-release/archive/release/bouncy/ros2service/0.5.4-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "2f1af1869ac89c8a8276de8db0ad0538"
SRC_URI[sha256sum] = "d7a9bf67cd56d205b572912db9c8d003b688a60369f2d69e914e493661496b96"
S = "${WORKDIR}/ros2cli-release-release-bouncy-ros2service-0.5.4-0"

ROS_BUILD_TYPE = "ament_python"
ROS_RECIPES_TREE = "recipes-ros2"

# Allow the above settings to be overridden.
include ${ROS_LAYERDIR}/recipes-ros/ros2cli/ros2cli_common.inc
include ${ROS_LAYERDIR}/recipes-ros2/ros2cli/ros2cli_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/ros2cli/ros2cli-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/ros2cli/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/ros2cli/${BPN}-${PV}.inc

inherit ros_${ROSDISTRO}
inherit ros_${ROS_BUILD_TYPE}

