# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Pythonic implementation of behaviour trees."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "bouncy"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=16;endline=16;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "python3-pydot python3-setuptools"
SRC_URI = "https://github.com/stonier/py_trees-release/archive/release/bouncy/py_trees/0.8.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "b6e10142e484b76991841e87711a968b"
SRC_URI[sha256sum] = "7a74e506f0962a511ef5f7d8ee989bcb004bef9640f3bfe5eb08bcc29b22882e"
S = "${WORKDIR}/py_trees-release-release-bouncy-py_trees-0.8.2-0"

inherit ros
inherit setuptools3


