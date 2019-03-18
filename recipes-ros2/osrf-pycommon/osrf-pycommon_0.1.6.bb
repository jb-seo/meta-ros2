# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Commonly needed Python modules, used by Python software developed at OSRF."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "crystal"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = "python-mock"
SRC_URI = "https://github.com/ros2-gbp/osrf_pycommon-release/archive/release/crystal/osrf_pycommon/0.1.6-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "a8d87b2565ea2d8f3ee91123f081a0ba"
SRC_URI[sha256sum] = "0b57f393c62abbe990c23c9b55272fc0e97d402ef68d2e9f7fc3c3a66f4c9d97"
S = "${WORKDIR}/osrf_pycommon-release-release-crystal-osrf_pycommon-0.1.6-0"

inherit ros-bpn setuptools3

BBCLASSEXTEND += "native"
