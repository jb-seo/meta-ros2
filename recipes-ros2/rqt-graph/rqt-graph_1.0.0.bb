# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "rqt_graph provides a GUI plugin for visualizing the ROS       computation graph.<br/>       Its components are made generic so that other packages       where you want to achieve graph representation can depend upon this pkg       (use <a href="http://www.ros.org/wiki/rqt_dep">rqt_dep</a> to find out       the pkgs that depend. rqt_dep itself depends on rqt_graph too)."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "crystal"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=14;endline=14;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = " python-qt-binding qt-dotgraph rqt-gui rqt-gui-py"
SRC_URI = "https://github.com/ros2-gbp/rqt_graph-release/archive/release/crystal/rqt_graph/1.0.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "9432d8d84d1801437ed357aaaf4f6c18"
SRC_URI[sha256sum] = "be6c134c9cba9e340285adf8ef258246c296e399194db6bad557cf57098cd217"
S = "${WORKDIR}/rqt_graph-release-release-crystal-rqt_graph-1.0.0-0"

inherit ament
