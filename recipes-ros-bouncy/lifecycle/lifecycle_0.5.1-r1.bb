# Copyright 2018 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Package containing demos for lifecycle implementation"
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "bouncy"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = "ament-cmake lifecycle-msgs rclcpp-lifecycle ros2run std-msgs"
SRC_URI = "https://github.com/ros2-gbp/demos-release/archive/release/bouncy/${PN}/0.5.1-1.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "02b781997f64f0d45c42a04a5431e718"
SRC_URI[sha256sum] = "6332f447f3f3cb92e0acec1003880711f6f3d60dce930caae161ef1785224ea6"
S = "${WORKDIR}/demos-release-release-bouncy-${PN}-0.5.1-1"

inherit catkin
