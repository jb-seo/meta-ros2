# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Framework for ROS 2 command line tools."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "crystal"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = "python3-resource rclpy"
SRC_URI = "https://github.com/ros2-gbp/${PN}-release/archive/release/crystal/${PN}/0.6.3-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "830642258335b35100a533e5d274fdcc"
SRC_URI[sha256sum] = "b777413fcbd5057055a331e5375bbb562c0cbb62074464298a593170795eb9ee"
S = "${WORKDIR}/${PN}-release-release-crystal-${PN}-0.6.3-0"

inherit ros-bpn setuptools3
