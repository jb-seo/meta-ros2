# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Instrumentation library for real-time performance testing"
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "bouncy"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = ""
SRC_URI = "https://github.com/ros2-gbp/realtime_support-release/archive/release/bouncy/${PN}/0.5.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "9e8e68db2e38e65c05b8c8ea80b4967f"
SRC_URI[sha256sum] = "41d6ed6b03234309699f43a26934fa36739b16465c1adf4d36ad339666e5c3b0"
S = "${WORKDIR}/realtime_support-release-release-bouncy-${PN}-0.5.0-0"


inherit ros
inherit ament

