# Copyright 2018 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Commonly needed Python modules, used by Python software developed at OSRF."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "bouncy"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = ""
SRC_URI = "https://github.com/ros2-gbp/osrf_pycommon-release/archive/release/bouncy/osrf_pycommon/0.1.5-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "de091037d0cf6059e8d2b743c7086413"
SRC_URI[sha256sum] = "32a8e0fd3fce442d5ef55e68905ed9aceef565c5d4fd4b97d32f5397d05fb9ea"
S = "${WORKDIR}/osrf_pycommon-release-release-bouncy-osrf_pycommon-0.1.5-0"

inherit catkin
