# Copyright 2018 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Helper scripts for tests that use the ROS launch tool."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "bouncy"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = "ament-index-python launch"
SRC_URI = "https://github.com/ros2-gbp/launch-release/archive/release/bouncy/launch_testing/0.5.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "2ef325639f74f64b5269195580fb5b8b"
SRC_URI[sha256sum] = "9746df289b691ebd0fb95549e769aeaaf8bcefff688b690b7f648b386001d106"
S = "${WORKDIR}/launch-release-release-bouncy-launch_testing-0.5.2-0"

inherit catkin
