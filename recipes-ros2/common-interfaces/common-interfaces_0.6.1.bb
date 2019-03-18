# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "common_interfaces contains messages and services that are widely used by other ROS packages."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "crystal"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = "actionlib-msgs  builtin-interfaces diagnostic-msgs geometry-msgs nav-msgs sensor-msgs shape-msgs std-msgs std-srvs stereo-msgs trajectory-msgs visualization-msgs"
SRC_URI = "https://github.com/ros2-gbp/common_interfaces-release/archive/release/crystal/common_interfaces/0.6.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "3062f9915147c9d50ee9143404e93f42"
SRC_URI[sha256sum] = "ff57c8465eb21ae5a6d109da36edd8b13c31c475c9e0f18fcad0c8119889f136"
S = "${WORKDIR}/common_interfaces-release-release-crystal-common_interfaces-0.6.1-0"

inherit ament pythonpath-insane
