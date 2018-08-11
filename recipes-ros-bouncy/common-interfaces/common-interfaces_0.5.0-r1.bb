# Copyright 2018 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "common_interfaces contains messages and services that are widely used by other ROS packages."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "bouncy"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = "actionlib-msgs ament-cmake builtin-interfaces diagnostic-msgs geometry-msgs nav-msgs sensor-msgs shape-msgs std-msgs std-srvs stereo-msgs trajectory-msgs visualization-msgs"
SRC_URI = "https://github.com/ros2-gbp/common_interfaces-release/archive/release/bouncy/common_interfaces/0.5.0-1.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "14788dfb0be66ff27733c02eb8dbb369"
SRC_URI[sha256sum] = "9c885b63bef23766227d9d266062a6dfa8cfc95d9bb06b540c25e01e0ffb6903"
S = "${WORKDIR}/common_interfaces-release-release-bouncy-common_interfaces-0.5.0-1"

inherit catkin
