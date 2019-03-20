# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "dummy robot bringup"
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "bouncy"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = "dummy-map-server dummy-sensors launch robot-state-publisher ros2run"
SRC_URI = "https://github.com/ros2-gbp/demos-release/archive/release/bouncy/dummy_robot_bringup/0.5.1-1.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "a4c7f8ca49a78d3a1ca0e2ffa1be4020"
SRC_URI[sha256sum] = "61a7d4f485423bba0b09308d0f66f865b0f24cd0822fb23680cf02861d1e750a"
S = "${WORKDIR}/demos-release-release-bouncy-dummy_robot_bringup-0.5.1-1"


inherit ros
inherit ament

